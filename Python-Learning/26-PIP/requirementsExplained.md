### What is a requirements.txt?

It’s a text file which records the Python packages our project depends on. This way, others don’t have to guess which packages our project needs.

## Installing packages from the requirements.txt file

Typically, python projects will not have their venv folders uploaded to GitHub. Instead, the requirements file will be what is required to know the packages needed for the copied project.

Once we have copied the project and then created our own virtual environment, we can then run this code to read the file and install the listed packages and their versions into our python environment:

`python -m pip install -r requirements.txt`

## Creating the requirements.txt from our current environment

Once we have installed packages into our venv, we can then generate a requirements file with this command:

`python -m pip freeze > requirements.txt`
