# How to Approach Normal Form?

## 1st Read the Notation Carefully

If given: `R(A, B, C, D)`

This means:

- `R` = relation/table
- `A,B,C,D` = attributes/columns

If something is underlined, it normally indicates that the underlined attribute/column is part of the key. For example, it could be the Primary Key.

## 2nd Write Down Every Functional Dependency

A functional dependency has the form `X = Y`, this means knowing `X` determines the values of `Y`.

There may be several functional dependencies. Keep them visible as they are the rules we will use to work out the keys and normal form.

## 3rd Work Out The Candidate Key

### What is a candidate key?

A **candidate key** is the smallest set of attributes that uniquely identifies a row. There can be more than one candidate key. An example could be `StudentID`, as it uniquely identifies a student.

### Composite key

If we need two attributes to identify a row, then the combination can be a composite candidate key.

## 4th If the key is explicitly given, then use it

Suppose we are told: `R(A, B, C, D)` and that `A` is underlined.

Thus, we already know that the **Candidate Key** is `A`.

## 5th If the key isn't given, find it

This is where **Attribute Closure** can help. The idea behind this is:

- `R(A, B, C, D)`
- `A` = `B`
- `B` = `C`

Start with `A`.

1. We already have `A` from `A = B`.

Now we can add `B`: `AB`

2. Then because `B = C`, we can add `C`.

The notation list continues: `ABC`

3. We still don't have `D`

Therefore, `A` is **not** a key for `R(A, B, C, D)`.

So we try having this notation instead: `AD`

4. As a result of `A`, we can identify `BC`, and we already have `D` in the notation. 

Therefore, `AD` determines every attribute.

### Following Questions

Now we need to delve deeper into the result, `AD`.

1. Can we remove `A`?

No because `D` on its own cannot determine everything in the tables.

2. Can we remove `D`?

No because `A` cannot determine everything.

Therefore, `AD` is a candidate key.

## 6th Distinguish between Candidate Key, Superkey and Composite Key

This particularly matters for **2NF**.

### Candidate Key

A **minimal** unique identifier.

### Superkey

Any combination that uniquely identifies a row, even if it contains unnecessary attributes. For example, `ABD` would be a superkey because `B` is not necessary. 

### Composite Key

A key containing **more than one attribute**. For example, `AD` could be a composite candidate key.

## 7th Check 1NF

Now we move through the normal forms in order. Starting with 1NF.

The basic question to determine whether a table is in first normal form is, *are the attributes storing atomic values.*

This means that each field should contain only one value rather than a list or repeating group.

## 8th Check 2NF

This is where the candidate key becomes crucial.

### 2NF Rule

A relation is in 2NF if:

1. It is already in 1NF, and
2. There are no **partial dependencies** of non-key attributes on part of a composite candidate key.

If our key only contains one attribute, partial dependency isn't possible.

### What is Partial Dependency?

Suppose our candidate key is: `A + B` and we have `A = C`. `C` depends on only `A`, which is part of the full key `AB`, making `C` a partially dependent on `A`.

If this was the case, then the relation would not be in 2NF as it violates the rule.

Essentially, 2NF wants:

1. The whole composite key and non-key attributes.

It does not want:

2. Part of a composite key and non-key attributes.

## 9th Check 3NF

3NF is concerned with a different type of dependency. Basically, 3NF doesn't want **non-key attributes depending on other non-key attributes**.

This is commonly described as avoiding **transitive dependencies**.

### Transitive Dependency

For example:

- StudentID = CourseCode
- CourseCode = CourseName

Which essentially means:

- StudentID = CourseCode = CourseName

`CourseName` depends indirectly on StudentID through another non-key attribute (CourseCode).

This is the kind of situation 3NF is trying to eliminate.

## The Formal 3NF Test

It may be expected that the definition of 3NF to be more complex than previously mentioned.

This could be that a relation is in 3NF if for every non-trivial functional dependency: `X = Y`.

At least one of these is true:

1. `X` is a **superkey**, or
2. `Y` is a **prime attribute**

### The Terminology

- Superkey: a set of attributes that can uniquely identify a row.
- Prime attribute: an attribute that is part of at least one candidate key.
- Non-prime attribute: an attribute that isn't part of any candidate key.

## Example of checking 3NF

Suppose:

- `R(A, B, C)`
- Candidate key = `A`
- `B` = `C`

Since `A` is the key: `A` = `B,C`

But: `B = C` is also given.

Now we look at the 3NF test:

1. Is `B` a superkey? No
2. Is `C` a prime attribute? No, because the candidate key is `A`.

Therefore, `B = C` violates 3NF.


