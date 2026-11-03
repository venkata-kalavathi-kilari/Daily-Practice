# Selection Sort

## Problem
Given an array of elements, sort the array in ascending order using the Selection Sort algorithm.

Selection Sort repeatedly finds the smallest element from the unsorted part of the array and swaps it with the first element of the unsorted part.

## Example

**Input:**
```java
arr = [64, 25, 12, 22, 11]
```

**Output:**
```java
[11, 12, 22, 25, 64]
```

## Algorithm
1. Start from the first element of the array.
2. Assume the current element is the minimum element.
3. Compare it with all remaining elements.
4. Find the index of the smallest element.
5. Swap the smallest element with the current element.
6. Repeat the process until the array is sorted.

## Java Code

```java
public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {64, 25, 12, 22, 11};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
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
- O(1) 
