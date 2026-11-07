# Merge Sort

## Problem
Given an array of elements, sort the array in ascending order using the Merge Sort technique.

## Example

**Input:**
```text
[38, 12, 27, 43, 9, 31, 18]
```

**Output:**
```text
[9, 12, 18, 27, 31, 38, 43]
```

## Algorithm
1. Divide the array into two halves.
2. Recursively divide each half until every subarray contains only one element.
3. Compare elements from both halves.
4. Merge the elements in sorted order.
5. Repeat until the entire array is sorted.

## Java Code

```java
import java.util.Arrays;

public class MergeSort {

    static void mergeSort(int[] arr, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

    public static void main(String[] args) {

        int[] arr = {38, 12, 27, 43, 9, 31, 18};

        mergeSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
```

## Time Complexity

| Case | Complexity |
|---|---|
| Best Case | O(n log n) |
| Average Case | O(n log n) |
| Worst Case | O(n log n) |

## Space Complexity
- **O(n)** – Auxiliary space for temporary arrays.

## Key Points
- Merge Sort follows the Divide and Conquer technique.
- It is a stable sorting algorithm.
- It is not an in-place sorting algorithm in this implementation.
- It works efficiently for large datasets.
