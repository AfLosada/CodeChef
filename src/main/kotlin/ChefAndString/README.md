# Chef and String

[Link](https://www.codechef.com/problems/RECNDSTR)

## Solution

Its quite simple, L and R are opposite functions.
This means that you can rewrite L as R-1, and vice versa.

This means that when trying to solve the equation: 
```
L(V) = S and R(V) = S
is the same as
V = R(S) and V = L(S)
```