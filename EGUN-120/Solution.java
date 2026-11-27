class Solution {
    public int maximizeSum(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
       
            for(int i=0;i<arr.length&k>0;i++){
                if(arr[i]<0){
                    arr[i]=-arr[i];
                    k--;
                }
            }
        
            int sum=0;
            int minValue=Math.abs(arr[0]);
            for(int value:arr){
                sum+=value;
                minValue=Math.min(minValue,Math.abs(value));
            }
            if(k%2==1){
                sum-=2*minValue;
            }
        return sum;
    }
}
