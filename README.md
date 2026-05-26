# 3120. Count the Number of Special Characters I

## Problem Statement

A letter is called **special** if it appears in both lowercase and uppercase in the string.

Return the number of special letters.

## Example 1

Input: `"aaAbcBC"`  
Output: `3`

## Example 2

Input: `"abc"`  
Output: `0`

## Example 3

Input: `"abBCab"`  
Output: `1`

## Algorithm

1. Create two HashSets:
   - One for lowercase letters
   - One for uppercase letters

2. Traverse each character in the string:
   - If lowercase, add to lower set
   - If uppercase, convert to lowercase and add to upper set

3. Compare both sets:
   - If a character exists in both sets, increase count

4. Return the count of special characters

## Explanation

We use HashSet to store unique lowercase and uppercase letters separately.

While traversing the string:
- Lowercase letters are added directly
- Uppercase letters are converted to lowercase before storing

Finally, we count how many letters are present in both sets.

That count is the answer.

## Time Complexity

`O(n)`

## Space Complexity

`O(1)`
