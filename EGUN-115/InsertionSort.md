# Insertion Sort

## Problem
Given an array of elements, sort the array in ascending order using the Insertion Sort algorithm.

Insertion Sort builds the sorted array one element at a time by taking an element and inserting it into its correct position in the sorted part.

## Example

**Input:**
```java
arr = [5, 3, 4, 1, 2]
```
**Output:**
```java
[1, 2, 3, 4, 5]
```

## Algorithm
1. Start from the second element of the array.
2. Store the current element in a variable called `key`.
3. Compare the key with the previous elements.
4. Shift all elements greater than the key one position to the right.
5. Insert the key into its correct position.
6. Repeat until the entire array is sorted.

## Java Code

```java
public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {5, 3, 4, 1, 2};
        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
```

## Time Complexity
- Best Case: O(n)
- Average Case: O(n²)
- Worst Case: O(n²)

## Space Complexity
- O(1) 
