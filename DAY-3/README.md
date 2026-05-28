# Find Mean of Array (Without Overflow)

## Problem
Given an array of integers, find the mean (average) of all elements without causing overflow.

---

## Algorithm
1. Get the size of the array.
2. Initialize `avg = 0`.
3. Traverse each element in the array.
4. Update average using:

avg = avg + (x - avg) / (i + 1)

5. Return the integer value of the average.

---

## Step-by-Step Explanation

Array: `[1, 2, 3, 4, 5]`

- After 1st element → avg = 1
- After 2nd element → avg = 1.5
- After 3rd element → avg = 2
- After 4th element → avg = 2.5
- After 5th element → avg = 3

Final Mean = `3`

---

## Time Complexity
`O(n)`

---

## Space Complexity
`O(1)`

---
