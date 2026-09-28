# Terms Related to Databases

## What does Schema mean in relation to databases?

The **schema** describes the design/structure of a database. For example:

| Student_id | Name | Age |
|---------|---------|------|
|1|John|20|

Here, the data is:

- 1, John, 20

Whereas, the schema describes the structure, so:

- There is a table called `student`, containing columns called `student_id`, `name`, `age`, and `nationality`, with particular data types and constraints.

## Logical

Logical is what the database looks like in terms of its **structure and relationships**.

It is concerned with things such as:

- Table
- Columns
- Rows
- Relationships between tables
- Data types
- Constraints

For example, suppose we have:

| Student |
|---------|
|Student_id|
|Name|
|Age|
|Nationality|

This is the **logical view of the data**. It tells us that a `Student` table exists and that it has those four attributes.

Essentially, Logical is what data we have and how it is organized.

## Partitions

A partition is a **separate section of a larger set of data**.

Specifically in a database, partitioning means taking one large table or dataset and dividing it into smaller sections called partitions.

### Why use partitions?

One reason is performance. Suppose, we're looking for students from a `Students` database, containing 1,000,000 student records. We're specifically looking for students with IDs between 250,001 and 500,000. The DBMS may only need to work with **Partition 2** rather than searching through every record.

It can also help with **multiprocessing**, which is where different partitions are processed at the same time.

## Physical

Physical refers to **how and where the database actually stores the data**.

This includes things such as:

- Which files store the data
- Where those files are located
- How records are arranged on storage
- Indexes
- Partitions
- Storage pages/blocks

For example, the DBMS might take our `Student` data and physically split it into several partitions:

| Partition | Data |
|-------|-------------|
|1|Students 1-10,000|
|2|Students 10,001-20,000|
|3|Students 20,001-30,000|

The application can still see:

| Student |
|---------|
|Student_id|
|Name|
|Age|
|Nationality|

It doesn't necessarily need to know that the data has been physically divided into three sections.

## What is a Key?

A key is an attribute, or combination of attributes, that can uniquely identify a row. For example:

| Student ID | Name  | Age |
|------------|-------|-----|
| 101        | John  | 20  |
| 102        | Sarah | 21  |
| 103        | John  | 22  |

Suppose we want to find the student named **John**. We can't uniquely identify one row, because there are two Johns in `Name`.

However, if we attempted to find student **102**, then there is only one row with 102 in `Student ID`.

Therefore, Student ID uniquely identifies a student, making it a possible key.

## What is a Primary Key?

A primary key is they key the database has chosen as the main way of identifying each row. For example:

| **PK Student_ID** | Name  | Age |
|-------------------|-------|-----|
| 101               | John  | 20  |
| 102               | Sarah | 21  |
| 103               | John  | 22  |

Student_ID is the primary key because every student has a unique ID.

## What is a Candidate Key?

A candidate key is a minimal set of attributes that uniquely identifies every row. There are two important words here:

Candidate basically means that **it is possible a possible choice for the primary key**.

For example, suppose:

| Student ID | University Email| Name  |
|------------|--------------|-------|
| 101        | john@uni.ac.uk     | John  |
| 102        | sarah@uni.ac.uk   | Sarah |
| 103        | david@uni.ac.uk   | David |

Here, both Student ID and University Email uniquely identify each student. Therefore, both are candidate keys.

The database might choose Student ID as the primary key.

## What is a Composite Key?

Sometimes one column isn't enough to uniquely identify a row. For example, imagine an enrollment table:

| Student ID | Course Code | Grade |
|------------|-------------|-------|
| 101        | CS01        | A     |
| 101        | CS02        | B     |
| 102        | CS01        | B     |

When we analyze the Student ID column on its own, we can see that `101` appears twice. This could be because it is the same student but the table records a grade for each course.

As Student ID appears twice, it isn't enough to uniquely identify a row. The same goes for Course Code, which also has two of the same values.

However, if we combine the two columns together, then every combination becomes unique:

- (Student ID) 101 + CS01 (Course Code) = (Grade) A

Therefore, Student ID + Course Code is a composite key.

Essentially, **composite** means *made from two columns*.

### Candidate + Composite Key can overlap

- Candidate key: can this uniquely identify the row, and is it minimal?
- Composite key: does it contain multiple columns?

So we can have a composite candidate key, like our Student ID + Course Code example. As both columns can identify as a candidate key and because they consist of two columns, they are also composite.

Therefore, a candidate key can also be composite.

### What does Minimal mean?

Minimal means that we cannot remove one the relations attributes and still have a unique identifier.

When describing a candidate key, I stated that *A candidate key is a minimal set of attributes*.

An example of this would be, suppose:

- Student ID + Course Code

Uniquely identifies a row.

However, so does:

- Student ID + Course Code + Grade

Technically, that bigger combination is a **superkey**, but it isn't a candidate key because `Grade` isn't necessary, making Student ID + Course Code + Grade **not minimal**.

Meaning that we could remove it and still uniquely identify the row.

### What is a Superkey?

A superkey is any set of columns that uniquely identifies a row. It doesn't have to be minimal. Using the enrollment example:

- Student ID + Course Code
- Student ID + Course Code + Grade

Both of these are superkeys because they uniquely identify a row.

Again, only Student ID + Course Code is also a candidate key because it is minimal.

So, candidate key = minimal superkey.

## What is a Non-Trivial Dependency?

A **non-trivial dependency** is simply a functional dependency where the attributes on the right-hand side aren't already contained in the left-hand side.

For example:

### Starting with a normal dependency

Suppose: `A = B`

This is a non-trivial dependency because `B` is not already part of `A`.

## What is a Trivial Dependency?

Suppose we have: `A, B = A`

Here we're saying that knowing `A` and `B` determines `A`. However, that statement is already automatically true because we already know `A`.

Essentially, because `A` is on the left, it is classed as a trivial dependency. 

## Abbreviated Terms

| Term | Meaning |
|------|---------|
| **Relational database** | Database organized into related tables |
| **Table / Relation** | A collection of records |
| **Column / Attribute** | A property/field in a table |
| **Row / Record / Tuple** | One individual record |
| **Value** | The actual piece of data in a cell |
| **Primary key** | Uniquely identifies a row |
| **Foreign key** | Links to a key in another table |
| **Relationship** | Describes how tables are connected |
| **Schema** | The structure/design of the database |
| **Normalization** | Organizing the tables to reduce redundancy and dependency problems |

