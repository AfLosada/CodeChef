# Beautiful Array

[Link](https://www.codechef.com/problems/BTAR)

## Solution
Iterate once through the array of numbers and save each position with their respective remainer of 4 result.

This means that this number at this position needs 0,1,2,3 more to be divisible by 4.

If two numbers have a remainder of 2, and they are added, they will become divisble by 4.

If a number has a remainder of 1 and another of 2, they will become a number with a remainer of 3.

The idea is to iterate through all of the mapped positions until we have no more. If there is a remainder, print -1.