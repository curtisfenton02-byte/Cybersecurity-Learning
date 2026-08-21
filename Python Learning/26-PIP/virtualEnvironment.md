### Creating my own virtual environment

`python -m venv .venv`

## This creates the environment into whichever directory you run it from.

## To activate the environment:

`.\.venv\Scripts\Activate.ps1`

## Using the venv without activating it

**Running code**

`.\.venv\Scripts\python.exe code.py`

**or installing/updating packages**

`.\.venv\Scripts\python.exe -m pip install requests`

## To install dependencies:

`python -m pip install -r requirements.txt`

## To install, update, list and uninstall packages while environment is activated:

### Install

`pip install`

### Uninstall

`pip uninstall`

### Update

`pip install --upgrade`

### List current environment packages

`pip list`

### venv should not be committed to GitHub.

