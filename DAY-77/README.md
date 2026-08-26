# Split a Circular Linked List into Two Halves

## Problem
Given a circular linked list, split it into two circular linked lists of nearly equal size.

If the number of nodes is odd, the first list contains one more node than the second list.

## Algorithm
1. Traverse the circular linked list to find:
   - The total number of nodes.
   - The last node.
2. Calculate the middle position using:
   ```text
   mid = (count + 1) / 2
   ```
3. Traverse from the head to the middle node.
4. Store:
   - `head1` as the head of the first list.
   - `head2` as the node after the middle node.
5. Make the first half circular by connecting the middle node to `head1`.
6. Make the second half circular by connecting the last node to `head2`.
7. Return both heads using `Pair`.
## Example

### Input
1 -> 2 -> 3 -> 4 -> 5 -> back to 1

### Output
First List:
1 -> 2 -> 3 -> back to 1

Second List:
4 -> 5 -> back to 4

## Time Complexity
- **O(n)**

## Space Complexity
- **O(1)**
