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