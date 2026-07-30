# Minimum Number of Pushes to Type Word

## Problem
Given a string `word` containing distinct lowercase English letters, determine the minimum number of key presses required to type the word on a remapped telephone keypad.

Each key can contain up to **8 letters**. The first 8 letters require **1 push**, the next 8 require **2 pushes**, the next 8 require **3 pushes**, and the remaining letters require **4 pushes**.

## Algorithm
1. Find the length of the string `n`.
2. Initialize `ans = 0`.
3. Traverse the string from index `0` to `n - 1`.
4. For each character, calculate the number of pushes as `(i / 8) + 1`.
5. Add the pushes to `ans`.
6. Return `ans`.

## Example 1

### Input
word = "abcde"

### Output
5
### Explanation
There are only 5 letters, and each requires 1 push.

1 + 1 + 1 + 1 + 1 = 5

## Time Complexity
- **O(n)**

## Space Complexity
- **O(1)**
