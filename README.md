# leetcode_jan26
LEETCODE PROBLEMS
## Q1 out of boundary paths
There is an m x n grid with a ball. The ball is initially at the position [startRow, startColumn]. You are allowed to move the ball to one of the four adjacent cells in the grid (possibly out of the grid crossing the grid boundary). You can apply at most maxMove moves to the ball.
Given the five integers m, n, maxMove, startRow, startColumn, return the number of paths to move the ball out of the grid boundary. Since the answer can be very large, return it modulo 109 + 7.

<img width="389" alt="image" src="https://github.com/Poorvaahuja/leetcode_jan26/assets/122693422/f1ca9da2-8d98-40cb-adc2-2ccc1df6d41e">

## Q2 construct the longest new string
You are given three integers x, y, and z.
You have x strings equal to "AA", y strings equal to "BB", and z strings equal to "AB". You want to choose some (possibly all or none) of these strings and concatenate them in some order to form a new string. This new string must not contain "AAA" or "BBB" as a substring.
Return the maximum possible length of the new string.
