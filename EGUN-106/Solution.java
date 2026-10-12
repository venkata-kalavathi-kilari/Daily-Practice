class Solution {
    public int fun(int mid,int n,int m){
        long ans=1;
        for(int i=1;i<=n;i++){
            
            if(mid != 0 && ans > m / mid) return 2;
            ans=ans*mid;
        }
        if(ans==m) return 1;
        return 0;
    }
    public int nthRoot(int n, int m) {
        // code here
        if (m == 0) return 0;
        int low=1,high=m;
        
        while(low<=high){
            int mid=(low+high)/2;
            int res=fun(mid,n,m);
            if(res==1) return mid;
            else if(res==0) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
}
