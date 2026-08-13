# Two Sum

## Problem
Given an integer array `nums` and an integer `target`, find two different indices whose corresponding values add up to the target.

Return the indices of the two numbers.

## Algorithm
1. Create an array `arr` of size 2 to store the answer.
2. Use two nested loops to check every possible pair.
3. For each pair, check whether `nums[i] + nums[j] == target`.
4. If the sum equals the target, store the indices `i` and `j`.
5. Return the result array.

## Example

### Input
nums = [2, 7, 11, 15]
target = 9

### Output
[0, 1]

### Explanation
nums[0] + nums[1] = 2 + 7 = 9

Therefore, the answer is `[0, 1]`.

## Time Complexity
- **O(n²)** — Two nested loops check all possible pairs.

## Space Complexity
- **O(1)** — Only
