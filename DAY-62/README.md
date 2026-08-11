# Delete Last Occurrence of a Key in a Linked List

## Problem
Given a singly linked list and an integer `key`, delete the **last occurrence** of that key from the linked list.

If the key is not present, return the original linked list.

## Algorithm
1. Initialize:
   - `last` to store the last node containing the key.
   - `lastPrev` to store the node before the last occurrence.
   - `curr` to traverse the list.
   - `prev` to track the previous node.
2. Traverse the entire linked list.
3. Whenever `curr.data == key`:
   - Store `curr` in `last`.
   - Store `prev` in `lastPrev`.
4. After traversal:
   - If `last == null`, the key was not found.
   - If `lastPrev != null`, skip the last occurrence using:
     ```java
     lastPrev.next = last.next;
     ```
   - If the last occurrence is the head, move the head to the next node.
5. Return the updated head.

## Example

### Input
Linked List: 1 -> 2 -> 3 -> 1 -> 4
key = 1

### Output
1 -> 2 -> 3 -> 4

### Explanation
The key `1` occurs twice:

```text
1 -> 2 -> 3 -> 1 -> 4
^              ^
First          Last
```

The **last occurrence** of `1` is deleted:

```text
1 -> 2 -> 3 -> 4
```

## Time Complexity
- **O(n)**

## Space Complexity
- **O(1)**
