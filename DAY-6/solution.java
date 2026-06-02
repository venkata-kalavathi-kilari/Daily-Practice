class Solution {

    int secondLargest(int[] arr) {

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int n : arr) {

            if (n > first) {
                second = first;
                first = n;
            } else if (n > second && n != first) {
                second = n;
            }
        }

        return second;
    }
}
