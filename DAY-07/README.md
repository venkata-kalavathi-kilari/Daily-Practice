# Replace with Adjacent Multiplication

## Problem 

Given an array `arr[]`, replace each element with the product of itself and its adjacent elements.

For each index `i`:

arr[i] = arr[i-1] * arr[i] * arr[i+1]

Assume:
- Previous of the first element = 1
- Next of the last element = 1
## Example

### Input

arr[] = [2, 4, 5]

### Output

arr[] = [8, 40, 20]
## Explanation

Start with `prev = 1`

### i = 0
Current = 2  
Next = 4  

arr[0] = 1 × 2 × 4 = 8

Update prev = 2

### i = 1
Current = 4  
Next = 5  

arr[1] = 2 × 4 × 5 = 40

Update prev = 4

### i = 2
Current = 5  
Next = 1  

arr[2] = 4 × 5 × 1 = 20

Update prev = 5

Final array = [8, 40, 20]
## Algorithm

1. Initialize `prev = 1`.
2. Traverse the array from left to right.
3. Store the current element before updating it.
4. Find the next element:
   - If current index is the last index, use `1`.
   - Otherwise, use the next array element.
5. Replace the current element with:

   prev × current × next

6. Update `prev` with the original current value.
7. Repeat until the end of the array.
## Time Complexity

O(n)

## Space Complexity

O(1)

