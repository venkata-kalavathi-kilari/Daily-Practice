# Pyramid Pattern in Java

## Problem 
Print a pyramid pattern of `*` symbols for a given number of rows `n`.

### Example Input
n = 5

### Example Output
    *
   ***
  *****
 *******
*********

## Algorithm
1. Read the number of rows `n`.
2. Use an outer loop to print each row.
3. Print `(n - i)` spaces before the stars.
4. Print `(2 * i - 1)` stars in the current row.
5. Move to the next line.
6. Repeat until all rows are printed.



## Time Complexity
O(n²)

## Space Complexity
O(1)
