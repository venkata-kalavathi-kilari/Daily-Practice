# Merge Two Sorted Linked Lists

## Problem
Given two sorted singly linked lists, merge them into one sorted linked list and return the head of the merged list.

## Algorithm
1. Create a dummy node to simplify the merging process.
2. Use a pointer `curr` to build the merged list.
3. Compare the data of `head1` and `head2`.
4. Attach the smaller node to the merged list.
5. Move the pointer of the selected list forward.
6. Continue until one of the lists becomes empty.
7. Attach the remaining nodes of the non-empty list.
8. Return `dummy.next` as the head of the merged list.

## Example

### Input
List 1: 1 -> 3 -> 5
List 2: 2 -> 4 -> 6

### Output
1 -> 2 -> 3 -> 4 -> 5 -> 6

## Time Complexity
- **O(n + m)**

## Space Complexity
- **O(1)** auxiliary space.
