class Solution {
    public static boolean possible(int[] arr,int day,int m,int k){
        int count=0;
        int noOfBouquets = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day){
                count++;
            }else{
                noOfBouquets+=count/k;
                count=0;
            }
        }
        noOfBouquets+=count/k;
        if(noOfBouquets>=m) return true;
        else{
            return false;
        }
    }
    public int minDaysBloom(int[] arr, int k, int m) {
        // code here
        if(arr.length<m*k) return -1;
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
           min = Math.min(min, arr[i]);
           max = Math.max(max, arr[i]);
       }

        int low=min,high=max,ans=high;
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(arr,mid,m,k)==true){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
            
        }
        return ans;
    }
}
