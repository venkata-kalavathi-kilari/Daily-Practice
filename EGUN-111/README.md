# Least Weight Capacity to Ship Packages Within D Days

## Problem

Given an array of package weights and an integer `d`, find the **minimum ship capacity** required to ship all packages within `d` days.

- Packages must be shipped in the given order.
- The total weight shipped in one day must not exceed the ship's capacity.
- Each package must be shipped completely on a single day.

## Algorithm

1. Create an integer array `weights` from the given `ArrayList`.
2. Find the minimum possible capacity (`low`) as the maximum package weight.
3. Find the maximum possible capacity (`high`) as the sum of all package weights.
4. Apply binary search while `low <= high`.
5. Calculate `mid`, the possible ship capacity.
6. Call `findDays()` to calculate how many days are required:
   - Start with `days = 1` and `load = 0`.
   - If adding the current package exceeds the capacity, start a new day and set `load` to the current package weight.
   - Otherwise, add the package weight to the current day's load.
7. If the required days are less than or equal to `d`, try a smaller capacity by setting `high = mid - 1`.
8. Otherwise, increase the capacity by setting `low = mid + 1`.
9. Return `low`, the minimum valid capacity.

## Example

### Input
arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
d = 5

### Output
15

### Explanation

With a capacity of `15`, the packages can be shipped in 5 days:

```text
Day 1: 1 + 2 + 3 + 4 + 5 = 15
Day 2: 6 + 7 = 13
Day 3: 8
Day 4: 9
Day 5: 10
```

A capacity smaller than `15` cannot ship all packages within 5 days.

Therefore, the minimum required capacity is `15`.

## Time Complexity

**O(n × log(sum - max + 1))**

- Finding the minimum and maximum capacity takes `O(n)`.
- Each call to `findDays()` takes `O(n)`.
- Binary search checks the capacity range from `max` to `sum`.

## Space Complexity

**O(n)** — The `weights` array stores all elements from the input `ArrayList`.
