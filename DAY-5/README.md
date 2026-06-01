# Minimum Cost of Buying Candies With Discount

## Problem Summary

A shop offers a discount where for every two candies purchased, one additional candy can be taken for free. The free candy must have a cost less than or equal to the cheaper of the two purchased candies.

The task is to find the minimum cost required to buy all the candies.

## Algorithm

1. Sort the candy costs in ascending order.
2. Traverse the array from the largest cost to the smallest.
3. Keep a counter to track the candies processed.
4. Add the cost of the first two candies in every group of three.
5. Skip the third candy because it is free.
6. Return the total cost.

## Example

**Input:**

cost = [6, 5, 7, 9, 2, 2]


**Sorted Array:**

[2, 2, 5, 6, 7, 9]

**Processing from largest to smallest:**

* 9 → Pay
* 7 → Pay
* 6 → Free
* 5 → Pay
* 2 → Pay
* 2 → Free

**Total Cost:**

text
9 + 7 + 5 + 2 = 23


**Output:**

23

## Time Complexity

* O(n log n) — Sorting the array.

## Space Complexity

* O(1) — Extra space used is constant.
