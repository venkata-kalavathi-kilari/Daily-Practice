class Solution {
    int floorSqrt(int n) {
        // code here
        long low=1,high=n;
        long ans=1;
        while(low<=high){
            long mid=(low+high)/2;
            long val=mid*mid;
            if(val<=n){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return (int)ans;
    }
}
