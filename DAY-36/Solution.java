class Solution {
    public int minDiff(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);

        int diff = Integer.MAX_VALUE;

        for (int i = 0; i < n - 1; i++)
        {
            if (arr[i + 1] - arr[i] < diff)
                diff = arr[i + 1] - arr[i];
        }
        return diff;
    }
}
