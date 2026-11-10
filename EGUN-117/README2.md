# Sort a String

## Problem
Given a string, sort its characters in ascending order and return the sorted string.

## Example

**Input:**
```java
s = "geeks"
```
**Output:**
```text
"eegks"
```
## Algorithm
1. Convert the given string into a character array using `toCharArray()`.
2. Sort the character array using `Arrays.sort()`.
3. Convert the sorted character array back into a string using `new String()`.
4. Return the sorted string.

## Time Complexity
O(n log n) 

## Space Complexity
O(n)
