# System

[Link](https://www.codechef.com/problems/ZOOZ)

N = size of object

Divide n by two, start building two strings at the same time. 
Add a series of 0s and 1s on each string until their combined size 
is greater or equal than N.

If it is equal, join the strings by reversing the second one.

If it is greater, add the next number to the first string and reverse
the second one.
