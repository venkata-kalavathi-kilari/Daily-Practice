class Solution {
    public int[] getThreeLargest(int arr[]) {
        int first = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > first) {
                third = sec;
                sec = first;
                first = arr[i];
            }
            else if (arr[i] != first && arr[i] > sec) {
                third = sec;
                sec = arr[i];
            }
            else if (arr[i] != first && arr[i] != sec && arr[i] > third) {
                third = arr[i];
            }
        }

        if (third != Integer.MIN_VALUE) {
            return new int[]{first, sec, third};
        }
        else if (sec != Integer.MIN_VALUE) {
            return new int[]{first, sec};
        }
        else {
            return new int[]{first};
        }
    }
}
