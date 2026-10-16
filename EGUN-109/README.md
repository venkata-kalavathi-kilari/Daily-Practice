# Minimum Days to Make M Bouquets

## Problem

Given an array `arr`, where `arr[i]` represents the day the `i`th flower blooms, find the **minimum number of days required to make `m` bouquets**, with each bouquet containing `k` **adjacent flowers**.

- A flower can be used only after it blooms.
- Each flower can be used in only one bouquet.
- If it is impossible to make `m` bouquets, return `-1`.

## Algorithm

1. If `arr.length < m * k`, return `-1` because there are not enough flowers.
2. Find the minimum and maximum bloom days in the array.
3. Set `low = min` and `high = max`.
4. Use binary search to find the minimum possible day.
5. For each `mid` day, call `possible()`:
   - Count consecutive flowers that have bloomed by that day.
   - Whenever an unbloomed flower is found, calculate the bouquets using `count / k` and reset `count`.
   - After the loop, count bouquets from the remaining consecutive flowers.
6. If at least `m` bouquets can be made:
   - Store `mid` as the answer.
   - Search for an earlier day by setting `high = mid - 1`.
7. Otherwise, search later days by setting `low = mid + 1`.
8. Return `ans`.

## Example

### Input
arr = [1, 10, 3, 10, 2]
m = 3
k = 1
### Output
3
### Explanation

We need `3` bouquets, with `1` flower in each bouquet.

- **Day 1:** Only one flower has bloomed. We can make 1 bouquet.
- **Day 2:** Two flowers have bloomed. We can make 2 bouquets.
- **Day 3:** Three flowers have bloomed. We can make 3 bouquets.

Therefore, the minimum number of days required is `3`.

## Time Complexity

**O(n × log(max - min + 1))**

- Finding the minimum and maximum takes `O(n)`.
- Each call to `possible()` takes `O(n)`.
- Binary search checks the range of bloom days.

## Space Complexity

**O(1)** — Only a constant number of extra variables are used.
