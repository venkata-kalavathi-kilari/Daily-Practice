# Multiply Two Numbers Represented by Linked Lists

## Problem
Given two linked lists where each node represents a digit of a number, find the product of the two numbers.

Since the result can be very large, return the answer modulo `1000000007`.

## Algorithm
1. Convert the first linked list into a number using `getNumber()`.
2. Convert the second linked list into a number using `getNumber()`.
3. While converting:
   - Multiply the current number by `10`.
   - Add the current node's digit.
   - Take modulo `1000000007` to avoid overflow.
4. Multiply both numbers.
5. Return the result modulo `1000000007`.

## Example

### Input
```text
First List:  1 -> 2 -> 3
Second List: 4 -> 5
```

These linked lists represent:

```text
123 and 45
```

### Output
```text
5535
```

## Time Complexity
- **O(n + m)**

## Space Complexity
- **O(1)**
