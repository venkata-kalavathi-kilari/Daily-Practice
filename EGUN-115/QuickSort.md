# Quick Sort

## Problem
Given an array of elements, sort the array in ascending order using the Quick Sort technique.

## Example

**Input:**
```text
[10, 7, 8, 9, 1, 5]
```

**Output:**
```text
[1, 5, 7, 8, 9, 10]
```

## Algorithm
1. Select an element as the pivot.
2. Partition the array so that smaller elements are placed before the pivot and larger elements after it.
3. Place the pivot in its correct sorted position.
4. Recursively apply Quick Sort to the left subarray.
5. Recursively apply Quick Sort to the right subarray.
6. Continue until the array is completely sorted.

## Java Code

```java
import java.util.Arrays;

public class QuickSort {

    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 7, 8, 9, 1, 5};

        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
```

## Time Complexity

| Case | Complexity |
|---|---|
| Best Case | O(n log n) |
| Average Case | O(n log n) |
| Worst Case | O(n²) |

## Space Complexity
- Average Case: O(log n) recursion stack.
- Worst Case: O(n) recursion stack.

## Key Points
- Quick Sort follows the Divide and Conquer technique.
- It uses a pivot element for partitioning.
- It is generally an in-place sorting algorithm.
- It is not a stable sorting algorithm.
- Its average performance is O(n log n).
