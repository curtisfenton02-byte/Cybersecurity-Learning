# Lab 1 Normal Form Section

## NF Lab Exercise

### Assuming R (A, B, C, D) is a relation with a functional dependency B → C in which normal form is R?

In relational-database theory, `R` represents a *relation*, and `A`, `B`, `C` and `D` are its attributes.

However, in an actual DBMS, we'd normally interpret `R` as a *table* and `A-D` as columns.

There is also `B → C` which is called a **functional dependency**. This means that if we know `B`, we can determine `C`.

For example:

| A | B | C    | D  |
|---|---|------|----|
| X | 1 | Red  | 50 |
| Y | 2 | Blue | 60 |
| Z | 1 | Red  | 70 |

If we know that `B = 1`, then we can determine that `C = Red`.

## Finding the Candidate Key in this question

Whilst we know that `B` determines `C`, it doesn't allow us to uniquely identify a row, because there are two rows where `B = 1`.

Therefore, to uniquely identify a row, we'd need enough information to distinguish:

- X, 1, Red, 50

From:

- Z, 1, Red, 70

Hence, why we would consider A + B + D as the candidate key because these 3 columns tell us the values within each row of A, B and D. Plus B gives us C, so together they determine everything.

If we consider ABD, because B = C, and then A and D are the only other values not accounted for. The result is that ABD determines all the attributes.

Now we check whether it is **minimal**:

- AB cannot determine D.
- AD cannot determine C or B.
- BD cannot determine A.

So, we cannot remove any of A, B, or D. Therefore, ABD is a candidate key.

Plus, because it has three attributes, ABD is also a composite key.

**R is in 1NF**

## Partial Dependency

Now when we look at the dependency again, we have:

- Candidate key = ABD
- B = C

The key is A + B + D but C depends only on B, rather than the entire key. This is called **Partial Dependency**. 

A partial dependency is when a non-key attribute (C) depends on **part of a composite key**, rather than the whole composite key.

## Does our relation satisfy 1NF?

Nothing in R(A, B, C, D) indicates that a cell contains multiple values.

In usual database-theory interpretation, we can therefore assume that the relation satisfies 1NF.

## Does our relation satisfy 2NF?

We currently have:

- Candidate key = ABD

And:

- B = C

B is only part of the composite key and yet it determines C. Therefore, we have a **partial dependency**.

As a result, **R is NOT in 2NF**.

## Q1. Answer

R is in First Normal Form but not Second Normal From because C is partially dependent on attribute B, which is part of the composite key.
