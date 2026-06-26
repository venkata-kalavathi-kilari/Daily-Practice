class Solution {

    static boolean isSorted(int arr[]) {

        int n = arr.length;
        for (int i = 1; i < n; i++)
            if (arr[i - 1] > arr[i])
                return false;

        return true;
    }
}
