# Segregate 0s and 1s

## Problem
Given an array containing only 0s and 1s, rearrange the array so that all 0s come first, followed by all 1s.

## Example

**Input:**
```java
arr = {0, 1, 0, 1, 1, 0}
```

**Output:**
```java
{0, 0, 0, 1, 1, 1}
```

## Algorithm
1. Initialize two counters: `Zero = 0` and `one = 0`.
2. Traverse the array.
3. If the element is 0, increment `Zero`.
4. Otherwise, increment `one`.
5. Fill the first `Zero` positions with 0.
6. Fill the remaining positions with 1.

## Time Complexity
O(n) - We traverse the array to count zeros and ones, then fill the array.

## Space Complexity
O(1) - We modify the original array without using extra space.
