# Best Time to Buy and Sell Stock

## Problem

Given an array `price[]` where `price[i]` represents the price of a stock on the `i`th day.

Find the maximum profit that can be achieved by buying the stock on one day and selling it on a later day.

If no profit is possible, return `0`.

## Algorithm

1. Set `lowPrice` as the first price.
2. Set `maxProfit` as `0`.
3. Traverse the array.
4. If the current price is smaller than `lowPrice`, update `lowPrice`.
5. Otherwise, calculate the profit:
   `profit = price[i] - lowPrice`
6. Update `maxProfit` if the current profit is greater.
7. Print `maxProfit`.


## Example

### Input
7
7 1 5 3 6 4

### Output
5

## Time Complexity

O(n)

## Space Complexity

O(1)
