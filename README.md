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

<img width="391" alt="image" src="https://github.com/Poorvaahuja/leetcode_jan26/assets/122693422/bc334856-8d33-4d5c-87d1-8cd383fc3351">

## Q3 short encoding of words
A valid encoding of an array of words is any reference string s and array of indices indices such that:
words.length == indices.length
The reference string s ends with the '#' character.
For each index indices[i], the substring of s starting from indices[i] and up to (but not including) the next '#' character is equal to words[i].
Given an array of words, return the length of the shortest reference string s possible of any valid encoding of words.

<img width="379" alt="image" src="https://github.com/Poorvaahuja/leetcode_jan26/assets/122693422/070f60d0-a410-41a6-acca-dc0f496eea5c">

## Q4 special permutations
You are given a 0-indexed integer array nums containing n distinct positive integers. A permutation of nums is called special if:
For all indexes 0 <= i < n - 1, either nums[i] % nums[i+1] == 0 or nums[i+1] % nums[i] == 0.
Return the total number of special permutations. As the answer could be large, return it modulo 109 + 7.

<img width="366" alt="image" src="https://github.com/Poorvaahuja/leetcode_jan26/assets/122693422/1691a041-77e4-4830-beff-a25d8b983c75">
