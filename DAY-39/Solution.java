class Solution {
    int upperBound(int[] arr, int target) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>target){
                return i;
            }
        }
        return n;
    }
}
