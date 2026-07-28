# Check if an ArrayList is Sorted

## Problem
Given an `ArrayList<Integer> arr`, determine whether it is sorted in either **ascending** or **descending** order. Return `true` if it is sorted in any one of these orders; otherwise, return `false`.

## Algorithm
1. Initialize two boolean variables:
   - `ase = true` (assume the array is sorted in ascending order).
   - `des = true` (assume the array is sorted in descending order).
2. Traverse the `ArrayList` from index `0` to `size() - 2`.
3. If the current element is greater than the next element, the array is not ascending. Set `ase = false`.
4. If the current element is less than the next element, the array is not descending. Set `des = false`.
5. After checking all elements, return `ase || des`.

## Example 1

### Input
arr = [1, 3, 5, 7]

### Output
true

### Explanation
The ArrayList is sorted in ascending order.
## Time Complexity
- **O(n)**

## Space Complexity
- **O(1)**
