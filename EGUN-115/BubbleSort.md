# Bubble Sort

## Problem
Given an array of elements, sort the array in ascending order using the Bubble Sort algorithm.

Bubble Sort repeatedly compares adjacent elements and swaps them if they are in the wrong order. After each pass, the largest element moves to its correct position at the end.

## Example

**Input:**
```java
arr = [5, 3, 8, 2, 1]
```

**Output:**
```java
[1, 2, 3, 5, 8]
```

## Algorithm
1. Start with the first element of the array.
2. Compare two adjacent elements.
3. If the first element is greater than the second, swap them.
4. Continue comparing adjacent elements until the end of the unsorted part.
5. Repeat the process for the remaining elements.
6. Stop when the array is sorted.

## Java Code

```java
public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 2, 1};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
```

## Time Complexity
- Best Case: O(n²)
- Average Case: O(n²)
- Worst Case: O(n²)

## Space Complexity
- O(1) – Constant extra space.
