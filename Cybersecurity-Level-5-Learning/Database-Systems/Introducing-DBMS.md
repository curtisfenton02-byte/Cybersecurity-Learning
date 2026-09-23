# Lecture 01 Notes - Introducing DBMS

## What is a DBMS?

DataBase Management Systems (DBMS) is a software that allows users to create, store, organize, retrieve, update, and manage data in a database.

Think of it as the middle layer between a user/application and the database itself.

An example university database might look like:

| Student ID | Name | Course |
|------|-------------|-------|
|1001|Alice|Cybersecurity|
|1002|Bob|Computer Science|

This database is where the information is stored.

Whereas, the DBMS is the software that lets the university:

- Add a new student
- Search for a particular student
- Change a student's details
- Delete records
- Control who can access the data
- Keep the data organized and consistent

## Common DBMSs

Commonly used DBMSs include:

- MySQL
- PostgreSQL
- Microsoft SQL Server
- Oracle Database
- SQLite
- Microsoft Access

## DBMS Layers

Imagine a banking application wants to retrieve someone's account balance. The entire data requesting structure is as follows:

Client / Application
        ↓
       API
        ↓
      DBMS
        ↓
Data Storage Engine
        ↓
Physical Storage

Each part has a different job.

### 1. The client makes a request

The client could be:

- A user using an application
- A website
- Another service
- A program

For example, continuing with our banking scenario, they might request that the database to find the balance for customer 12345.

The application doesn't normally interact directly with the physical database files.

### 2. The API allows the client to communicate with the DBMS

The application needs a way to communicate with the DBMS.

Hence, why we have an API (Application Programming Interface) as the next stage. An API is essentially, a **communication interface** that allows the application to send database requests to the DBMS.

There are various types of APIs, including:

- Open Database Connectivity (ODBC)
- Java Database Connectivity (JDBC)
- .NET: Microsoft's framework for applications and database connectivity.

For example, a Java application might use JDBC to send an SQL query to a database.

### 3. The DBMS handles the logical level

The logical level is concerned with **what data is being requested and what needs to be done with it**, rather than where the data physically exists.

Suppose the bank application sends SQL commands, to identify the customer associated with account number 12345.

The DBMS would interpret these SQL commands to determine what it is that the application is requesting.

The DBMS can also check such things as:

- Does the table exist?
- Does the user have permission?
- Is the SQL query valid?
- How should the query be executed efficiently?

### 4. The data storage engine handles the physical level

The data storage engine deals with **how the data is actually stored and retrieved from storage**.

It may interact with:

- Database files
- Indexes
- Memory/buffers
- Disk or SSD storage.

## Characteristics of DBMS

### Data Independence 

Data independence means that changes to how data is stored or organized should not unnecessarily affect the users or application that use the database.

Application don't need to care about every underlying change made to the database, so long as they can continue to make requests.

There are two levels to this.

### Physical Data Independence

This means that we can change how the data is physically stored without changing how users and applications interact with it.

For example, suppose a database contains:

| Students |
|--------|
|StudentID|
|Name|
|Course|

The database administrator might later decide to:

- Move the database to a faster SSD.
- Change the way records are physically stored.
- Create or modify indexes.
- Reorganize database files.
- Change storage structures to improve performance.

These are all **physical changes**.

As a result, the application can still use:

```SQL
SELECT Name
FROM Students;
```

Without needing to know how the data is physically stored.

### Logical Data Independence

This is about changing the **logical structure/schema of the database** without unnecessarily breaking applications that use it.

For example, using our Student database example:

| Students |
|--------|
|StudentID|
|Name|
|Course|

Later, we add: Email.

Now the table becomes:

| Students |
|--------|
|StudentID|
|Name|
|Course|
|Email|

Therefore, an application that only uses:

```SQL
SELECT Name, Course
FROM Students;
```

Could potentially continue working without modification.

This example demonstrates that whilst the logical structure has changed, the existing parts of the database, which the application relies upon, can remain usable.

Not every logical change is harmless. For example, removing the Course column from the database, could potentially break an application.

## Data Integrity 

A DBMS helps ensure that only valid and consistent data is stored. Some rules come from the database system itself, while database designers can define additional rules specific to their organization. These rules are called integrity constraints and can be specified by declaring what must be true (declarative) or by defining the steps needed to enforce the rule (imperative).

For example:

| Student Field | Data |
|--------|---------|
|StudentID|1001         |
|Name        | Alice        |
|Course        |Cybersecurity        |

This is a valid database.

However, this:

| Student Field | Data |
|--------|---------|
|StudentID|1001         |
|Name        | Alice        |
|Course        |Banana        |

Might be invalid if *Banana* isn't an actual course in the university's database.

### Logically Inconsistent Data

This means that the DBMS can be given rules about what constitutes as valid data.

An obvious example would be, if someone tried to enter 30/02/2026 into the database, then it should be rejected as this isn't a valid date.

### Some rules are built into the data type

A DBMS can enforce certain rules simply through the **data type** or structure we have provided. For example:

```SQL
DateOfBirth DATE
```

This tells the DBMS that DOB must contain a valid date.

Similarly:

```SQL
Age INTEGER
```

This means that we shouldn't be able to store a string like "hello" as the age.

### Users can also define their own rules

People designing/administrating the database can establish rules that are specific to the organization. An example rule for the Student database could be that a *student must be enrolled on a course*.

| Students |
|--------|
|StudentID|
|Name|
|CourseID|

By including a CourseID section, we can make a rule requiring that this section refers to an actual course.

### Integrity Constraints

These are the rules that the database uses to ensure data remains valid and consistent.

Examples include:

- NOT NULL

Meaning that a value must be provided.

```SQL
Name VARCHAR(100) NOT NULL
```

This specifically means that a student can't have a missing name.

- PRIMARY KEY

Uniquely identifies each record.

```SQL
StudentID INT PRIMARY KEY
```

This means that we couldn't have two of the same primary keys, such as:

- 1001 Alice
- 1001 Bob

### Declarative vs Imperative

DBMS rules may be declared either:

- Declaratively: meaning that we decide what rule we want, and the DBMS takes care of enforcing it. 
- Imperatively: meaning that we specify the steps or logic that should be performed to enforce the rule.

## Query Optimization

This is the process in which a DBMS examines a query and considers different ways of executing it. It selects an efficient strategy based on things such as the tables, indexes, and operations involved. The chosen strategy is called the execution plan.

### What is a Query?

A query is a request for data from a database.

### What is an Index?

An index is a structure that helps the DBMS find particular records more efficiently.

Think of it in the context of a book. Without an index, we would have to read every page to find a specific topic.

Whereas with an index, we are told what page of the book our topic is at.

## Concurrency

A DBMS may have users accessing data simultaneously. Therefore, it needs concurrency control to prevent conflicting operations from corrupting or producing inconsistent data. 

One mechanism used to achieve this is **locking**, which is where access to particular data is temporarily restricted while it is being modified.

### Why could concurrency be a problem?

Suppose, Alice (the manager) has £500 in an account. Now staff member A wants to withdraw £100 from the account. At almost the same time, staff member B wants to withdraw £200.

Total withdrawn (£500 - £300) = £200

If both users read the original £500 and then overwrite the value independently, the database could end up with **£300**, when it should actually be £200.

This is an example of a concurrency problem.

## Security

DBMS security generally involves two stages:

- Authentication
- Authorization

The difference being that authentication verifies a user's identity, while authorization determines what that authenticated user is permitted to do. 

Many DBMSs provide built-in functionality for managing both.

## Backup & Recovery

A DBMS must be able to recover from failures during database operations. If an operation partially completes and then fails, the DBMS should be able to undo those changes rather than leaving the database in an inconsistent state.

DBMSs may also provide facilities for making regular backups, such as automatically scheduling backups, so the database can be restored after a larger failure.

### Why is this important?

Suppose a bank transfer is in process between two accounts:

- Account A: is transferring - £100 to account B.
- Account B: is gaining + £100 from account A.

These two changes really need to be treated as a single operation as if only one account A was processed, then the account B would never gain the £100 as it would effectively disappear.

Hence, why DBMS needs to ensure that either both or neither changes happen.

## DBMS Architecture

### Client-Servers

In a client-server DBMS architecture, a database server runs DBMS software as a background service and manages the databases. Client applications connect to that server over a network and send requests for data.

Examples include:

- Oracle
- SQL
- Server
- PostgreSQL
- MySQL

### Embedded (aka. In-Process)

This is another major DBMS architecture type. The difference being that an embedded DBMS is a database that is integrated into and runs within the application rather than as a separate database server.

It commonly works with databases stored locally on the same machine. These systems are often lighter-weight than client-server DBMSs, although this is not always the case.