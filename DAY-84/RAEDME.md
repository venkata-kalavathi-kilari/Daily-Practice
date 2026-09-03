# Construct a Linked List Matrix from a 2D Array

## Problem

Given a 2D array, create a linked structure where each element is represented by a node.

Each node contains:
- `right` pointer → points to the next element in the same row.
- `down` pointer → points to the element directly below it in the next row.

Return the head of the matrix.

## Algorithm
1. Get the number of rows `m` and columns `n`.
2. Create an `ArrayList` to store the head node of each row.
3. Traverse every element of the 2D array.
4. Create a new node for each element.
5. Connect nodes in the same row using the `right` pointer.
6. Store the first node of every row in the `head` list.
7. After creating all rows, connect corresponding nodes of consecutive rows using the `down` pointer.
8. Return `mainHead`, which is the first node of the matrix.
## Example

### Input

```text
1  2  3
4  5  6
7  8  9
```

### Linked Matrix Structure

```text
1 -> 2 -> 3
|    |    |
↓    ↓    ↓
4 -> 5 -> 6
|    |    |
↓    ↓    ↓
7 -> 8 -> 9
```

## Time Complexity

- **O(m × n)**


## Space Complexity

- **O(m)**
