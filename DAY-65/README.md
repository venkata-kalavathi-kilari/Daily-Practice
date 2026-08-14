# Merge Two Linked Lists

## Problem
Given two linked lists `head1` and `head2`, merge the nodes of the second linked list into the first linked list by alternating their nodes.

The function returns the head of the modified first list and the remaining part of the second list.

## Algorithm
1. Initialize two pointers:
   - `curr1` → points to the first linked list.
   - `curr2` → points to the second linked list.
2. Traverse both lists while neither pointer is `null`.
3. Save the next nodes:
   - `ptr1 = curr1.next`
   - `ptr2 = curr2.next`
4. Insert `curr2` after `curr1`.
5. Restore the remaining links using `ptr1` and `ptr2`.
6. Move `curr1` and `curr2` to their next nodes.
7. Add `head1` and the remaining `curr2` to the result.

## Example

### Input
head1: 10 -> 9
head2: 6 -> 1 -> 2 -> 3 -> 4 -> 5

### Output
```text
head1: 10 -> 6 -> 9 -> 1
head2: 2 -> 3 -> 4 -> 5
```

## Explanation

Initially:

```text
List 1: 10 -> 9
List 2: 6 -> 1 -> 2 -> 3 -> 4 -> 5
```

First iteration:

```text
curr1 = 10
curr2 = 6
```

Save:

```text
ptr1 = 9
ptr2 = 1
```

Then:

```text
curr2.next = curr1.next
```

So:

```text
6 -> 9
```

Next:

```text
curr1.next = curr2
```

So:

```text
10 -> 6 -> 9
```

After moving the pointers:

```text
curr1 = 9
curr2 = 1
```

The process continues until one list becomes empty.

## Time Complexity
- **O(min(n, m))**
- `n` = length of first linked list
- `m` = length of second linked list

## Space Complexity
- **O(1)** auxiliary space
