class Solution {
    int minSubsets(int arr[]) {
        // code here
        Arrays.sort(arr);
        int count=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]+1!=arr[i+1]){
                count++;
            }
        }
        return count;
    }
}
