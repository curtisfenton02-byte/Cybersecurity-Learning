# Normal Form Terminology Recap

Here, I will include my notes for Lab 1 Q1: Assuming R (A, B, C, D) is a relation with a functional dependency B → C in which normal form is R?

## What is Normal Form?

**Normalization** is the process of organizing a relational database to reduce problems such as **duplicated and inconsistent data**.

The normal forms are stages:

- 1NF
- 2NF
- 3NF

Think of these stages as increasingly strict rules about how attributes in a relation depend on one another.

### 1NF

1NF stands for First Normal Form and at its simplest, requires that values are **atomic**.

Atomic means that a single cell should contain a single value, rather than a collection of values. For example:

| Student | Phone numbers |
|----------|--------|
|John|07123, 07987|

As the Phone numbers cell contains multiple values, it would not satisfy the usual idea of 1NF.

Essentially, 1NF is concerned with the basic structure of the relation and its values.

### 2NF

2NF stands for Second Normal Form and for a relation to satisfy this rule, it must:

1. Already be in 1NF.
2. Have no partial dependencies of non-key attributes on a composite candidate key.

### 3NF

3NF stands for Third Normal Form and for a relation to satisfy this rule, it must:

1. Be in 1NF.
2. Be in 2NF.
3. Avoid certain **transitive dependencies** involving non-key attributes.

The main idea is that a non-key attribute should depend on the key, not on another non-key attribute. For example:

- Student_ID = CourseCode
- CourseCode = CourseName

This creates: Student_ID = CourseCode = CourseName

Here CourseName indirectly depends on Student_ID through another non-key attribute.

This is the type of problem 3NF is designed to remove.

### What is Transitive Dependency?

A transitive dependency is essentially an indirect dependency. Imagine:

- A = B
- B = C

Which gives A = C through B.

In database normalization, this becomes a problem when the dependencies involve the key and non-key attributes in the relevant way. Take our Student_ID example from earlier, that is a **transitive dependency**.

## What is a Relational Database?

A relational database is a database that stores data in tables (relations), with the tables connected to each other through relationships.

### Relational Database vs Table

These are not the same thing:

- Table: one collection of related data.
- Relational database: a collection of related tables, together with the rules that connect them.

### Why does Functional Dependency matter for Normalization?

Normalization asks whether attributes depend on the **correct things**.

## How does this question relate to 3NF?

The question only gives B = C, and we have already established that the candidate key is ABD.

As:

1. B is not a superkey.
2. C is not part of the candidate key.

This violates the formal 3NF condition.

The formal definition of 3NF's rule is *for every non-trivial dependency (X = Y), either X is a superkey, or Y is a prime attribute.*

### Prime Attribute

A prime attribute is an attribute that is part of a candidate key. For example, our candidate key is ABD, so:

- A = prime
- B = prime
- D = prime

However, C is not part of the candidate key so, C = non-prime/non-key attribute.


