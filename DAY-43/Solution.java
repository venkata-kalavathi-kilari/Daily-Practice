class Solution {
    public int getMinDiff(int[] arr, int k) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        int ans=arr[n-1]-arr[0];
        for(int i=1;i<n;i++){
        if(arr[i]-k <0) continue;
         int minH=Math.min(arr[0]+k,arr[i]-k);
         int maxH=Math.max(arr[i-1]+k,arr[n-1]-k);     
         ans=Math.min(ans,maxH-minH);    
        }
        return ans;
    }
}
