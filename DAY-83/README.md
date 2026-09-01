# Inorder Traversal of Binary Tree Using Morris Traversal

## Problem
Given the root of a binary tree, return its inorder traversal without using recursion or an explicit stack.

Inorder traversal follows:

```text
Left -> Root -> Right
```

## Algorithm
1. Initialize `curr` with the root node.
2. While `curr` is not `null`:
   - If `curr.left` is `null`:
     - Add `curr.data` to the result.
     - Move to the right child.
   - Otherwise:
     - Find the inorder predecessor of `curr`.
     - If no temporary link exists:
       - Create a temporary link from the predecessor to `curr`.
       - Move `curr` to its left child.
     - If the temporary link already exists:
       - Remove the temporary link.
       - Add `curr.data` to the result.
       - Move to the right child.
3. Return the result.

## Example

### Input

```text
        1
       / \
      2   3
     / \
    4   5
```

### Output

```text
4 2 5 1 3
```

## Time Complexity

- **O(n)**

## Space Complexity

- **O(1)**
