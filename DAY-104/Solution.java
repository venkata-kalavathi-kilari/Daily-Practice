class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int n=arr.length;
        int low=0,high=n-1;
        int ans=Integer.MAX_VALUE;
        int index=-1;
        while(low<=high){   
            int mid=(low+high)/2;
            if(arr[low]<=arr[high]){
                if(arr[low]<ans){
                    index=low;
                    ans=arr[low];
                }
                break;
            }
            if(arr[low]<=arr[mid]){
                index=low;
                ans=Math.min(ans,arr[low]);
                low=mid+1;
            }
            else{
                high=mid-1;
                index=mid;
                ans=Math.min(ans,arr[mid]);
            }
        }
        return index;
    }
}
