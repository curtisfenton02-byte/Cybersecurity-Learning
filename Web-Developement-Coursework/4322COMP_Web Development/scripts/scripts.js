class ListItem{
    constructor(description,dueDate, webLink,completionDate){
        this.description=description;// stores task text        
        this.dueDate=dueDate;//stores due date
        this.webLink=webLink || "";//stores optional URL link
        this.createdOn=new Date().toISOString();//when task is created store it
        this.completionDate=completionDate || null;//if completion date added, save it, or set as empty
        this.isNew=true;//for newly created tasks
    }
    isComplete(){
        return this.completionDate!==null;//checks whether task is completed
    }
    markCompleted(){//if so saves that days date as completion date
        this.completionDate=new Date().toISOString().split("T")[0];
    }
    markIncomplete(){//removes task completion
        this.completionDate=null;
    }
}
// main data arrays
let masterList=[];
let viewList=[];
let marks=[];
let assessments=[];//for the JSON file contents
//calendar state
let currentDate=new Date();
//timer state
let runningTimer;
let timeLeft;

//Web-page starting function
function startWebsite(){
    if (document.forms["add-item-form"]){
        setupTasks();//checks if task form exists
    }
    if (document.getElementById("calendarGrid")){//checks for calendar
        setupCalendar();
    }
    if(document.getElementById("addMarkButton")){//checks grades
        setupGrades();
    }
    if (document.getElementById("startTimer")){//checks timer
        setupTimer();
    }
}
function setupTasks(){//sets up task list
    document.forms["add-item-form"].addEventListener("submit",addTask);//runs when form is submitted
loadList();//loads tasks from local storage
loadTargetGrade();
updateViewList();//organizes tasks
displayList();
tasksComingUp();
overdueTasks();
}
function setupCalendar(){//sets up calendar
    loadList();
    loadAssessments();
    displayCalendar(currentDate);//calendar needs tasks, JSON and current date

    //calendar buttons
    const previousMonthButton=document.getElementById("prevMonth");
    const nextMonthButton=document.getElementById("nextMonth");//finds HTML element 
if (previousMonthButton){//checks that button exists
    previousMonthButton.addEventListener("click",showPreviousMonth);
}
if (nextMonthButton){
    nextMonthButton.addEventListener("click", showNextMonth);
}
const closeBtn=document.getElementById("closePanel");
if (closeBtn){
    closeBtn.addEventListener("click", closePanel);
}
}
 //sets up grade tracker 
    function setupGrades(){
        loadAssessments();
        loadSavedMarks();
        loadTargetGrade();
        showGrades();
document.getElementById("addMarkButton").addEventListener("click",saveMark);//more buttons
document.getElementById("targetGrade").addEventListener("change", function(){//save new target and refresh grade
        saveTargetGrade();
        showGrades();
   });
}//buttons for timer
function setupTimer(){
document.getElementById("startTimer").addEventListener("click", startTimer);
document.getElementById("pauseTimer").addEventListener("click",pauseTimer);
document.getElementById("resetTimer").addEventListener("click",resetTimer);
}

//runs when student adds a task
function addTask(event){
    event.preventDefault();//Stops form refreshing page
//retrieves input elements 
    const descriptionInput = document.forms["add-item-form"]["description"];
    const dueDateInput = document.forms["add-item-form"]["due-date"];
    const resourceInput=document.getElementById("webLink");
    const completionInput=document.getElementById("completionDate");
    //gets input values
    const description=descriptionInput.value;
    const dueDate=dueDateInput.value;
    const webLink=resourceInput.value;
    const completionDate=completionInput.value;

    //Ensures the input is correct
    let errorMessages = validateTask(description, dueDate, completionDate);
    //If input is not correct, the webpage will show an error
    showErrors(errorMessages);
    //stops if errors exist
    if (errorMessages.length > 0){
        return;
    }
    //Creates new task object
    const newTask = new ListItem(description.trim(), dueDate, webLink, completionDate || null);//blank completion dates stored as null
        
    //Adds to the array
    masterList.push(newTask);
   //Saves the task
    saveList();
    //refreshes task views
    updateViewList();
    displayList();
    tasksComingUp();
    overdueTasks();
    displayCalendar(currentDate);//updates calendar
   
    document.forms["add-item-form"].reset();//resets the form after adding task
}
//validates task form data
function validateTask(description, dueDate, completionDate){ 
    let errorMessages = [];//store validation errors
    if (description.trim() ===""){//checks if the description is empty
        errorMessages.push("Can you please enter the task you want to complete.");
}//blocks HTML tags 
if(description.indexOf("<")!== -1|| description.indexOf(">")!== -1){
    errorMessages.push("Sorry, your task description cannot contain a HTML tag.");
}
if (dueDate === "") {//checks for a due date
    errorMessages.push("Enter your task's due date here: ");
}else{
    let today=new Date();
    today.setHours(0,0,0,0);//compares dates only

    let chosenDate=new Date(dueDate);
    chosenDate.setHours(0,0,0,0);
if (chosenDate<today){//checks whether date is set for before today
    errorMessages.push("Sorry, the task date cannot be set in the past.")
}
}//validates the completion date
if(completionDate!==""){//only if user entered a completion date
    let completed=new Date(completionDate);
    completed.setHours(0,0,0,0);

    let today=new Date();
today.setHours(0,0,0,0);
if(completed>today){//completion date must not be in the future
    errorMessages.push("Sorry, the task completion date cannot be in the future.");
}

}
return errorMessages;
}
//shows error messages 
function showErrors(errorMessages){
const errorBox = document.getElementById("errorMsg");
if(!errorBox){//stops error container if not present
    return;
}
    errorBox.innerHTML = "";//clears old errors
if (errorMessages.length===0){
    errorBox.classList.add("hidden");//hides the box if no errors
    return;
}
errorBox.classList.remove("hidden");
    errorMessages.forEach(function (error) {
        const errorItem = document.createElement("li");//adds each error as a list item
        errorItem.textContent = error;
        errorBox.appendChild(errorItem);
    });
}
function displayList(){
    const itemsContainer = document.getElementById("items");
    if(!itemsContainer){//stops display container if missing
        return;
    }
    itemsContainer.innerHTML="";//clears current task

    if (viewList.length===0){
        itemsContainer.textContent="You currently have no tasks in your list";
        return;
    }//loops through each task
    for (let i=0;i<viewList.length; i++){
    
        const item=viewList[i];
        const taskbox = document.createElement("div");//creates new task box 
      
        let itemClass="item";//builds item class list
        let today= new Date();
        today.setHours(0,0,0,0);
        
        let timedue=new Date(item.dueDate);
        timedue.setHours(0,0,0,0);
        
    if (item.isComplete()){
        itemClass += " complete strikethrough";//uses CSS for styling completed items
    }
    if (!item.isComplete()&& timedue<today){//incomplete and past due tasks
        itemClass += " overdue";
    }
    if(item.isNew){
        itemClass += " new-item";//adds animation to new tasks
    }
    taskbox.className=itemClass;
    
    let text=document.createElement("p");
    text.innerHTML="<strong>" + item.description+ "</strong><br>Due : " + item.dueDate;//shows task description and due date
    taskbox.appendChild(text);
    
    if (item.webLink!==""){//if there is a url 
        let link=document.createElement("a");//creates new HTML anchor element
        link.href = item.webLink;//adds clickable link for url
        link.target="_blank";
        link.textContent="Open resource";
        taskbox.appendChild(link);
        }
    if (item.isComplete()){//if task is complete
        let completedText=document.createElement("p");
        completedText.textContent="Completed: " + item.completionDate;//shows completion date
        taskbox.appendChild(completedText);
        }
            itemsContainer.appendChild(taskbox);//adds task box to page
            item.isNew=false;
    }
}

function updateViewList(){
    viewList=[...masterList];//copies tasks for display
    viewList.sort(function(a,b){
        return new Date(a.dueDate)-new Date(b.dueDate);//sorts tasks in order
});
}
function saveList(){
    localStorage.setItem("masterList", JSON.stringify(masterList));//stores data within the browser
}
function loadList(){
    const storedTasks= localStorage.getItem("masterList");//reads the saved text from local storage
    if(!storedTasks){//resets if no saved tasks exist
        masterList=[];
        return;
    }
    try{
        const parsed = JSON.parse(storedTasks);//converts stored text into javascript
        masterList=parsed.map(function(item){
            let rebuiltTask= new ListItem(//rebuilds each stored object into a class
        item.description,
        item.dueDate,
        item.webLink,
        item.completionDate
            );
        rebuiltTask.createdOn= item.createdOn || new Date().toISOString();//restores created on
        rebuiltTask.isNew=false;//no new item-animation
        return rebuiltTask;
        });
    }catch(error){
        masterList=[];
        console.error("Sorry, there was a problem when loading saved tasks.", error);
    }
}
function formatCalendarDate(year, month, day){//formats date 
    return year + "-" +
        String(month + 1).padStart(2, "0") + "-" +
        String(day).padStart(2, "0");
}

function getTasksForDate(dateString){//returns student tasks for day
    return masterList.filter(function(item){
        return item.dueDate === dateString;
    });
}

function getAssessmentsForDate(dateString){//returns assessment deadlines
    return assessments.filter(function(item){
        return item.deadline === dateString;
    });
}

//Calendar grid
function displayCalendar(date){
    const grid = document.getElementById("calendarGrid");
    const title = document.getElementById("calendarTitle");
    if (!grid||!title){
        return;
    }
    grid.innerHTML="";//clears old calendar
    const year=date.getFullYear();
    const month=date.getMonth();
    const firstDay=new Date(year,month,1).getDay();//Calculates first weekday
    const daysInMonth=new Date(year, month+1,0).getDate();//Calculates number of days
    const monthNames=[
        "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
    ];
   
    title.textContent = monthNames[month] + " " + year;
    for (let i=0; i<firstDay; i++){//adds blank cells before day one
        const emptyCell=document.createElement("div");
        emptyCell.className="calendar-empty";
        grid.appendChild(emptyCell);
    }

    for (let day=1;day<=daysInMonth; day++){//creates cell for each day
        const cell=document.createElement("div");
        cell.className="calendar-day";

        const dateString=formatCalendarDate(year, month, day);//changes day into text form
        const tasksForDay=getTasksForDate(dateString);//finds user tasks for day
        const assessmentsForDay= getAssessmentsForDate(dateString);//finds assessments
        const totalItems= tasksForDay.length + assessmentsForDay.length;//adds tasks and assessments together
       
        const today = new Date();//gets today's date
        today.setHours(0,0,0,0);
       
        const thisDate=new Date(dateString);//calendar cell date
        thisDate.setHours(0,0,0,0)

    if (thisDate.getTime()===today.getTime()){//highlights today
        cell.classList.add("today");
    }
    if (totalItems>0){
        if (thisDate<today){//colours dated cells
            cell.classList.add("calendar-overdue");//applies class for past date
        }else{
            cell.classList.add("calendar-upcoming");//applies for upcoming
        }
    }
       let dayNumber=document.createElement("strong");//adds day number bold
       dayNumber.textContent=day;
       cell.appendChild(dayNumber);
         
           if (totalItems===1){//item
            let textInfo=document.createElement("p");
            textInfo.textContent="1 item";
            cell.appendChild(textInfo);
            }else if(totalItems>1){//items
                let textInfo=document.createElement("p");
            textInfo.textContent= totalItems + " items";
            cell.appendChild(textInfo);
            }
            cell.addEventListener("click", function(){
                showTasksForDate(dateString);
            });
        grid.appendChild(cell);
}
}

function showPreviousMonth(){
    currentDate.setMonth(currentDate.getMonth()-1);
    displayCalendar(currentDate);
}
function showNextMonth(){
    currentDate.setMonth(currentDate.getMonth()+1);
    displayCalendar(currentDate);
}
 function showTasksForDate(dateString){//show the date's items
       //panel elements
    const panel= document.getElementById("selectedPanel");
       const title= document.getElementById("PanelTitle");
       const panelList=document.getElementById("PanelList");
       const tasksForDay=getTasksForDate(dateString);
       const assessmentsForDay=getAssessmentsForDate(dateString);

       panelList.innerHTML="";
       title.textContent="Items for " + dateString;
if (tasksForDay.length===0 && assessmentsForDay.length===0){
panelList.textContent="There is nothing due for this day.";
panel.classList.remove("hidden");
return;
        }
if (tasksForDay.length>0){
    let taskTitle=document.createElement("p");// adds revision task title
    taskTitle.textContent="Revision Tasks: ";
    panelList.appendChild(taskTitle);

    let taskList=document.createElement("ul");//unordered list
    tasksForDay.forEach(function(item){
        let taskItem=document.createElement("li");//creates task description list
        taskItem.textContent=item.description;
        taskList.appendChild(taskItem);
    });
    panelList.appendChild(taskList);
}
if (assessmentsForDay.length>0){
    let assessmentTitle=document.createElement("p");//assessment title
    assessmentTitle.textContent= "Assessment Deadlines: ";
    panelList.appendChild(assessmentTitle);

    let assessmentList=document.createElement("ul");
    assessmentsForDay.forEach(function(item){
        let taskItem=document.createElement("li");
        taskItem.textContent=item.module + " - " + item.assessmentName;
        assessmentList.appendChild(taskItem);
    });
    panelList.appendChild(assessmentList);//adds list
}
panel.classList.remove("hidden");//shows panel
 }
function closePanel(){//hides selected panel
    document.getElementById("selectedPanel").classList.add("hidden");
}

function tasksComingUp(){
        const alertsDiv = document.getElementById("upcomingAlerts"); //clears upcoming alerts
        if(!alertsDiv){
            return;
        }
        alertsDiv.innerHTML = "";
        
        const today = new Date();
        today.setHours(0,0,0,0);

        const next30Days = new Date();
        next30Days.setDate(today.getDate()+30);// next 30 days

        const upcomingTasks = masterList.filter(function(item){
            const timedue = new Date(item.dueDate);
            timedue.setHours(0,0,0,0);
            return timedue>= today && timedue <=next30Days;//compares student's tasks
        });
        const upcomingAssessments=assessments.filter(function(item){
            const timedue=new Date(item.deadline);
            timedue.setHours(0,0,0,0);
            return timedue >= today && timedue<= next30Days;//repeat for assessments
        });
        
        if (upcomingTasks.length === 0 && upcomingAssessments.length===0){
            alertsDiv.textContent = "There Are No Upcoming Tasks or Deadlines.";
            return;
        }
        const heading = document.createElement("p");
        heading.textContent = "These Tasks Are Coming Up Within The Next 30 Days:";
        alertsDiv.appendChild(heading);

        upcomingTasks.forEach(function(item){
            const p =document.createElement("p");
            p.textContent=item.description + " (due: " + item.dueDate + ")";
            alertsDiv.appendChild(p);
        });

        upcomingAssessments.forEach(function(item){
            const p =document.createElement("p");
            p.textContent=item.module + " - " + item.assessmentName + "(due: " + item.deadline + ")";
        alertsDiv.appendChild(p);
        });
    }
    function overdueTasks(){
        const overdueDiv=document.getElementById("overdueAlerts");
        if(!overdueDiv){
            return;
        }
        overdueDiv.innerHTML="";
        const today=new Date();
        today.setHours(0,0,0,0);
        const overdueTasks=masterList.filter(function(item){
            const timedue=new Date(item.dueDate);
            timedue.setHours(0,0,0,0);
        return timedue < today && !item.isComplete();
        });
        if (overdueTasks.length===0){
            overdueDiv.textContent="There are no overdue revision tasks.";
            return;
        }
        const heading=document.createElement("p");
        heading.textContent="These revision tasks are overdue: ";
        overdueDiv.appendChild(heading);

        overdueTasks.forEach(function(item){
            const p=document.createElement("p");
            p.textContent=item.description+ "(due: " +item.dueDate+ ")";
            overdueDiv.appendChild(p);
        });
        }
        function loadAssessments(){
    fetch("scripts/assessments.json")//JSON file data
    .then(function(response){//checks response
if(!response.ok){//if problem
    throw new Error("Could not load assessments.json");
}
return response.json();
    })
    .then(function(data){//stores data from file
        assessments= data;//updates page after loading assessments
        fillAssessmentDropdown();
        displayCalendar(currentDate);
        tasksComingUp();
    })
    .catch(function(error){
        console.error(error);
        alert("Assessment data could not be loaded.")
    });
     }

function fillAssessmentDropdown(){//creates dropdown for assessments
    const select=document.getElementById("assessmentSelect");
    if(!select){
            return;
        }
    select.innerHTML="";//clears old dropdown options
assessments.forEach(function(item){
    const option=document.createElement("option");//one option per assessment
    option.value=item.id;
    option.textContent=item.module + " - " + item.assessmentName;
    select.appendChild(option);
});
}
    function saveMark(){// saves and/or updates student marks
        const assessmentID=Number(document.getElementById("assessmentSelect").value);//turns ID into number
        let assessmentMark=document.getElementById("assessmentMark").value;
        if (assessmentMark ===""){
            alert("Please enter the mark you want to achieve here.");
            return;
        }
         
        assessmentMark=Number(assessmentMark);
        if (!Number.isInteger(assessmentMark)|| assessmentMark <0 || assessmentMark>100){
            alert("Enter a mark which is a whole number between 0 and 100.");
            return;
        }
        const selectedAssessment=assessments.find(function(item){//finds assessment in data
            return item.id===assessmentID;
        });
        if (!selectedAssessment){
            alert("Assessment data has not been loaded correctly yet.");
            return;
        }
        const markItem={//creates a record of marks
            id:selectedAssessment.id,
            module:selectedAssessment.module,
            assessmentName:selectedAssessment.assessmentName,
            weighting:selectedAssessment.weighting,
            mark:assessmentMark
        };
        const existingIndex=marks.findIndex(function(item){//checks for pre-existing mark
            return item.id=== markItem.id;
        });
    if(existingIndex !== -1){//updates or adds new mark
        marks[existingIndex]=markItem;
    }else{
        marks.push(markItem);
    }
    localStorage.setItem("marks", JSON.stringify(marks));//saves marks back to local storage
    showGrades();
    }
function loadSavedMarks(){//saved marks
    const storedMarks=localStorage.getItem("marks");
    if (storedMarks!==null){
        marks=JSON.parse(storedMarks);
    }
   
    }

function loadTargetGrade(){//loads saved target grade and applies
    const savedGoal=localStorage.getItem("targetGrade");
    if (savedGoal!==null){
        document.getElementById("targetGrade").value=savedGoal;
    }
}
function saveTargetGrade(){//stores selected grade
    const selectedGoal=document.getElementById("targetGrade").value;
    localStorage.setItem("targetGrade", selectedGoal);
}
function showGrades(){
    const output=document.getElementById("results");
    const targetFeedback=document.getElementById("targetFeedback");
    if (!output || !targetFeedback){
        return;
    }
    output.innerHTML="";
    targetFeedback.innerHTML="";

if (marks.length===0){
    output.textContent="No marks have been entered yet.";
    targetFeedback.textContent="Add more marks to compare your progress against your target grade.";
    return;
}
const enteredMarksHeading=document.createElement("p");//adds heading
enteredMarksHeading.textContent="Entered Marks: ";
output.appendChild(enteredMarksHeading);

marks.forEach(function(item){//shows each entered mark
    const p =document.createElement("p");
    p.textContent=item.module+ " - " + item.assessmentName + ":" + item.mark;
    output.appendChild(p);
});

const moduleTotalsHeading=document.createElement("p");
moduleTotalsHeading.textContent="Module Totals: ";
output.appendChild(moduleTotalsHeading);

let moduleTotals={};//object for total marks per module
marks.forEach(function(item){
    if(!moduleTotals[item.module]){
        moduleTotals[item.module]=0;//start module total
    }
    moduleTotals[item.module]+=item.mark*(item.weighting);//adds weighted mark
});
const targetGrade=Number(document.getElementById("targetGrade").value);//reads chosen target grade

for(const moduleName in moduleTotals){//loops through modules 
    const total=moduleTotals[moduleName];
    const p= document.createElement("p");
if (total>=targetGrade){
    p.textContent=moduleName + ": " + total.toFixed(1) + "%-On track for your intended goal";//provides feedback 
    p.classList.add("on-track");
}else{
    p.textContent=moduleName + ": " + total.toFixed(1) + "%-You are below your intended goal";
    p.classList.add("below-goal");
}
 output.appendChild(p);       
}
const feedback=document.createElement("p");
feedback.textContent="Your current target grade is: "+ document.getElementById("targetGrade").options[document.getElementById("targetGrade").selectedIndex].text;
targetFeedback.appendChild(feedback);
   }

function startTimer(){
    let studyTime=document.getElementById("studyTime").value;
    document.getElementById("timerMessage").textContent="";//clears old timer message
    if (studyTime===""){
        alert("Specify a time in which to study.");
        return;
    }
 studyTime=Number(studyTime);
    if(!Number.isInteger(studyTime)||studyTime<15||studyTime>40){
    alert("Make sure the time specified is a whole number between 15 and 40 minutes.");
    return;
    }
document.getElementById("startTimer").disabled=true;//disables start button for run time
    
clearInterval(runningTimer);//stops interval
timeLeft=studyTime*60;//turns mins to secs
remainingTime();//updates the timer
runningTimer=setInterval(function(){//countdown loop
timeLeft--;//reduce time every second
remainingTime();

if(timeLeft<=0){//stops at zero
clearInterval(runningTimer);
timeLeft=0;
remainingTime();
    document.getElementById("startTimer").disabled=false;//re-enables start button
    document.getElementById("timerMessage").textContent="Your study session is over.";
    const alertSound=document.getElementById("alertsound");//plays alert sound
    if(alertSound){
        alertSound.pause();
        alertSound.currentTime=0;
        alertSound.play();
    }
    
} 
    },1000);// runs every second
}
function pauseTimer(){//pauses timer and sound
    clearInterval(runningTimer);
const alertSound=document.getElementById("alertsound");
if(alertSound){
    alertSound.pause();
}
}
function resetTimer(){
    clearInterval(runningTimer);
    let studyTime=Number(document.getElementById("studyTime").value);//reuse valid study time
if (!Number.isInteger(studyTime)|| studyTime<15||studyTime>40){// uses default if invalid
    studyTime=25;//default time
}
timeLeft=Number(studyTime)*60;
remainingTime();
document.getElementById("startTimer").disabled=false;
document.getElementById("timerMessage").textContent="";//clears alert message

const alertSound=document.getElementById("alertsound");//ensures sound doesn't carry on after timer refreshes
if(alertSound){
    alertSound.pause();
    alertSound.currentTime=0;
}

}
function remainingTime(){//shows remaining time
    const minutes=Math.floor(timeLeft/60);
    const seconds=timeLeft%60;
    const formattedMinutes=String(minutes).padStart(2,"0");
    const formattedSeconds=String(seconds).padStart(2,"0");
document.getElementById("showTimer").textContent= 
formattedMinutes + ":" + formattedSeconds;
}
//runs startup function after HTML has loaded
document.addEventListener("DOMContentLoaded", startWebsite);