# Best Time to Buy and Sell Stock

## Problem
Given an array `prices[]`, where `prices[i]` represents the price of a stock on the `i`th day, find the maximum profit that can be achieved by buying the stock on one day and selling it on a later day.

If no profit can be made, return `0`.

## Algorithm
1. Initialize `buy` with the price of the first day.
2. Initialize `profit` to `0`.
3. Traverse the array from the second day.
4. If the current price is less than `buy`, update `buy`.
5. Calculate the profit by subtracting `buy` from the current price.
6. Update the maximum `profit` if the current profit is greater.
7. Return the maximum profit.


## Example 1

### Input
prices = [7, 1, 5, 3, 6, 4]

### Output
5
### Explanation
- Buy at price `1`
- Sell at price `6`
- Maximum Profit = `6 - 1 = 5`

## Time Complexity
- **O(n)**

## Space Complexity
- **O(1)**
