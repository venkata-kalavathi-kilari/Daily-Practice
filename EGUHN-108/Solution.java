class Solution {
    public boolean search(int[] arr, int key) {
        // code here
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
                    // Found key
                if (arr[mid] == key)
                   return true;

                // Handle duplicates
                if (arr[l] == arr[mid] && arr[mid] == arr[r]) {
                    l++;
                    r--;
                    continue;
                }

                    // Left half is sorted
                if (arr[l] <= arr[mid]) {
                    // Check if key is in left half
                if (arr[l] <= key && key < arr[mid])
                    r = mid - 1;
                else
                    l = mid + 1;
                }
                else {
                // Check if key is in right half
                    if (arr[mid] < key && key <= arr[r])
                        l = mid + 1;
                    else
                        r = mid - 1;
                    }
        }
        return false;
    }
}
