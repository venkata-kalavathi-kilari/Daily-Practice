# Static Counter Using Class Variable

## Problem
Create a static variable `count` initialized to `1`. Each time the `utility()` method is called, print the current value of `count` and then increment it by `1`.

## Algorithm
1. Declare a static variable `count` and initialize it to `1`.
2. Inside the `utility()` method:
   - Print the current value of `count`.
   - Increment `count` by `1`.
3. Since `count` is static, its value is shared across all objects of the class.


## Example

### Input
utility()
utility()
utility()

### Output

123

### Explanation
- First call prints `1`, then `count` becomes `2`.
- Second call prints `2`, then `count` becomes `3`.
- Third call prints `3`, then `count` becomes `4`.

## Time Complexity
- **O(1)**

## Space Complexity
- **O(1)**
