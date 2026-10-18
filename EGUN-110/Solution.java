class Solution {
    int sumByD(int[] arr,int div){
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum += (arr[i] + div - 1) / div;
        }
        return sum;
    }
    int smallestDivisor(int[] arr, int k) {
        // Code here
        if(arr.length>k) return -1;
        int low=1, high=Arrays.stream(arr).max().getAsInt();
        while(low<=high){
            int mid=(low+high)/2;
            if(sumByD(arr,mid)<=k){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
        
    }
}
