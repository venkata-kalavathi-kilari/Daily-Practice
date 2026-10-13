class Solution {
    public int findMax(int[] arr){
        int n=arr.length;
        int max=arr[0];
        for(int i=0;i<n;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
        }
        return max;
    }
    public int totalCount(int[] arr,int hourly){
        int totalHr=0;
        for(int i=0;i<arr.length;i++){
            totalHr += (int) Math.ceil((double) arr[i] / hourly);
        }
        return totalHr;
    }
    public int kokoEat(int[] arr, int k) {
        // code here
        int low=1,high=findMax(arr);
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            int totalHr=totalCount(arr,mid);
            if(totalHr<=k){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
