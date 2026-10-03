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

//Using Binary Search

class Solution {
    int upperBound(int[] arr, int target) {
        int n=arr.length;
        int low=0,high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
