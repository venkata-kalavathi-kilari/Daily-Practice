# Array Reverse

## Problem 
Given an array arr[], reverse the array.  
Reversing means:
- First element becomes last
- Second element becomes second last
- And so on...

## Examples

### Example 1
Input:
arr[] = [1, 4, 3, 2, 6, 5]

Output:
[5, 6, 2, 3, 4, 1]

Explanation:
The first element moves to last position, second moves to second last, and so on.

## Approach (Two Pointer Technique)

We use two pointers:
- left → starting index (0)
- right → last index (n - 1)

Steps:
1. Set left = 0 and right = n - 1
2. While left < right:
   - Swap arr[left] and arr[right]
   - Increment left
   - Decrement right
3. Continue until both pointers meet

## Algorithm
1. Start
2. Initialize left and right pointers
3. Swap elements while left < right
4. Return reversed array
5. End

## Time Complexity
O(n) → Each element is visited once

## Space Complexity
O(1) → In-place reversal
