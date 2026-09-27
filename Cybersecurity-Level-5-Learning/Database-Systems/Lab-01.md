# Database Systems Lab-01

## Data Independence in a Database Management System

A DBMS separates the way in which data is **stored internally** from the way applications **access the data**. This means that some changes to the database can be made without having to rewrite applications.

## Q1. Which changes can be made to a DBMS managed database?

### Splitting the data into two or more parts (partitioning) to allow multiprocessing?

Yes, this can generally be done in a DBMS without changing the applications.

Suppose a *Student* table contains 10 million records. The DBMS could physically split the data into several partitions so that different parts can be processed separately.

### Adding a nationality column to the student table?

Yes, conceptually this can be done without changing existing applications, provided those applications only depend on the columns they already use.

For example:

| Student_id | Name | Age |
|---------|---------|------|
|1|John|20|

We could add another column called *Nationality* to this table:

| Student_id | Name | Age | Nationality |
|---------|---------|------|-----|
|1|John|20|British|

Now, suppose an existing application only wanted a student's name and age data, then it can continue to function despite us changing the database.

### Removing a column from a table?

No, this could require changes to applications.

Suppose the original table is:

| Student_id | Name | Age |
|---------|---------|------|
|1|John|20|

Suppose we remove the *Age* column:

| Student_id | Name | 
|---------|---------|
|1|John|

Now if an application requests data from the student age column, then the application will no longer work because it is requesting a column that no longer exists.

Therefore, removing a column can directly affect the **logical structure** that applications depend upon.

## Question Overview

When asked whether a change to the DBMS managed database can affect something that an application depends on. Keep in mind that if the change is mainly about how the DBMS stores the data internally, remember that physical data independence means that applications can usually remain unchanged.

However, if the change alters the **logical structure of the data** that applications use, then consider whether the existing columns/relationships that applications depend on still exist.

## What are the two steps to DBMS Security, and in which order do they execute?

DBMS security generally involves two stages:

- Authentication
- Authorization

The difference being that authentication verifies a user's identity, while authorization determines what that authenticated user is permitted to do. 

Many DBMSs provide built-in functionality for managing both.

### The Order

Authentication is run first because the DBMS needs to know who a user is before it can determine what permissions they have.

Then comes authorization which determines what resources and actions the user is permitted to access.

## Describe the physical structure of a Crow's Foot Diagram, describing the tables, columns and relationships

To answer this question, I will describe the structure of the Crow's Foot Diagram, **picture available in Database-Systems-Screenshots folder**.

## Table

A table is represented as a rectangular box, of which there are two:

- Course
- Student

## Column

A column is an attribute/field belonging to the table and is normally listed inside the table box. In this case we have:

| Student |
|--------|
|num|
|name|
|DOB|
|code|


|Course|
|--------|
|code|
|name|
|credits|

Here, `num`, `name`, `DOB DATE` and `code` are the columns within *Student*.

The diagram also identifies that `code` is a **Primary Key** in the *Course* table. Code being a Primary Key within Course means that it uniquely identifies each course.

`name` and `credits` are both **nullable**, meaning that they are allowed to contain no value (`NULL`).

Within, the *Student* table `num` uniquely identifies each student.

Whereas, `code` is a **Foreign Key** within *Student* because it refers to `code` in *Course*.

### Data Types

Next to each attribute in the table are **Data Types**, which tells the DBMS *what kind of value can be stored in each column*.

The data types in the example design are:

| Student | Data Type |
|--------|---------|
|num        |Integer (INT)|
|name        |String (VARCHAR)|
|DOB         |DATE|
|code        |String|

| Course | Data Type |
|--------|---------|
|code|String|
|name|String|
|credits|TINYINT (Byte)|

- String (VARCHAR) is text made up of characters. It can have a (50) beside it to represent a variable-length string with a maximum of 50 characters. The character length chosen is based on what the column is meant to contain.
- Integer is a whole number.
- Byte is a small integer data type that uses one byte of storage. It is commonly used for relatively small whole numbers. The exact range for what constitutes as a byte depends upon the DBMS/programming language. Most of the time an unsigned byte can represent 0-255.
- Date stores a calendar date (00/00/0000).

## Constraints

This design also features **constraints**, which are rules that DBMS applies to a column to control what values are allowed.

### NULL/Nullable

This constraint means that there is currently no value recorded for this column.

In our design, `code` is NULL which reinforces the idea that **each student may belong to zero-or-one course** because `STUDENT.code` is nullable.

If `STUDENT.code` were NOT NULL, then every student would need to have a course.

### Primary Key (PK)

A primary key is a column, or combination of columns, that **uniquely identifies each row in a table**.

Within our COURSE table, we have `PK code` and the STUDENT table has `PK num`. This means that in:

**COURSE**
| code | name |
|--------|---------|
|CS01|Cyber Security|
|CS02|Computer Science|

`CS01` and `CS02` are different, so each course can be uniquely identified.

Likewise:

**STUDENT**
| num | name |
|--------|---------|
|101|John|
|102|Sarah|
|103|David|

`101`, `102` and `103` uniquely identify the students.

### Why is this important?

The DBMS needs a reliable way to distinguish one row from another. For example, we could have:

|101|John|
|102|John|

This is fine because the *names* don't need to be unique but the *student numbers* do. Hence, why it is declared as a PK.

A primary key is generally not allowed to be NULL because the DBMS needs every record to have an identifiable key.

### Foreign Key

This is the part which creates the connection between our two tables.

**COURSE**
PK code

**STUDENT**
PK num
FK code

Notice that `code` appears in **both** tables.

The difference being that in COURSE, code is a PK. Whereas in STUDENT, it is a FK.

Essentially, the FK informs the DBMS that the value in this column refers to a PK value within another column.

As a result:

**COURSE**
| code | name |
|--------|---------|
|CS01|Cyber Security|
|CS02|Computer Science|

Then:

**STUDENT**
| num | name | code |
|-----------|---------|---------|
|101|John|CS01|
|102|Sarah|CS01|
|103|David|CS02|

Because the `code` foreign key appears in both of these examples, the DBMS can follow the key from `STUDENT.code` to `COURSE.code` and make the connection that:

- John -> CSO1 -> Cyber Security

## Relationship

A relationship between two or more tables can be represented by both a line connecting them and their PK/FKs.

- PK/FK identifies which columns connect the tables.
- The relationship line and Crow's Foot symbols describe the nature of the connection.

### PK/FK Connection

In our example, the STUDENT.code FK points to the COURSE.code PK. This informs DBMS that both columns refer to each other.

Without this connection, the DBMS wouldn't know that STUDENT.code is supposed to refer to a course.

### The Line and Symbols Connection

The line in the Crow's Foot diagram represents the relationship, while the symbols at either end describe its **cardinality** and **optionality**.

COURSE                    STUDENT
   O| ───────────────────── |<

### O|

O| being at the course end means that **one Student** can be associated with **zero or one Course**.

We interpret this line and its two symbols as:

- *STUDENT's* relationship with COURSE being `O|` 

and:

- *Courses'* relationship with STUDENT being `|<`.

O: meaning **zero**
|: meaning **at least one**.
<: meaning **many**.

### |<

This is what's known as a *crow's foot*, and it means **many**. Therefore, by having `|` and `<`, we're saying:

*One Course must be associated with one or many Students*

This is also an example of a **many-to-one relationship**.


``
