# Add Two Numbers Represented by Linked Lists

## Problem
Given two linked lists where each node contains a digit of a number, add the two numbers and return the result as a linked list.

The digits are stored in the same order as they appear in the number.

## Algorithm
1. Reverse both linked lists so that the least significant digits come first.
2. Initialize:
   - `carry = 0`
   - `sum = null`
3. Traverse both lists while at least one list has nodes or a carry remains.
4. Add the current digits and the carry.
5. Calculate:
   - `carry = newValue / 10`
   - `newValue = newValue % 10`
6. Create a new node with the calculated digit.
7. Insert the new node at the beginning of the result list.
8. Remove leading zeros from the result.
9. If the result becomes empty, return a node containing `0`.
## Example

### Input
```text
List 1: 1 -> 2 -> 3
List 2: 4 -> 5 -> 6
```

### Output
```text
5 -> 7 -> 9
```

## Time Complexity
- **O(n + m)**


## Space Complexity
- **O(n + m)** for the result linked list.
