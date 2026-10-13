# Koko Eating Bananas

## Problem

Given an array `arr`, where each element represents a pile of bananas, and an integer `k` representing the maximum number of hours available, find the **minimum eating speed** required to finish all the bananas within `k` hours.

Koko eats at a speed of `hourly` bananas per hour. If a pile has fewer bananas than the speed, she finishes that pile in one hour.

## Algorithm

1. Find the maximum number of bananas in any pile using `findMax()`.
2. Initialize the binary search range:
   - `low = 1`
   - `high = maximum pile size`
3. Calculate `mid`, the possible eating speed.
4. Calculate the total hours required using `totalCount()`.
5. If `totalHr <= k`:
   - The speed is sufficient.
   - Store `mid` as the answer.
   - Search for a smaller speed by setting `high = mid - 1`.
6. Otherwise, increase the speed by setting `low = mid + 1`.
7. Return the minimum valid speed.

## Example

### Input
arr = [3, 6, 7, 11]
k = 8

### Output
4
### Explanation

If Koko eats at a speed of `4` bananas per hour:

| Pile | Hours required |
|---:|---:|
| 3 | 1 |
| 6 | 2 |
| 7 | 2 |
| 11 | 3 |
| **Total** | **8** |

Koko finishes all the bananas in exactly `8` hours.

Therefore, the minimum eating speed is `4`.

## Time Complexity

**O(n log m)**

## Space Complexity

**O(1)**
