class Solution {
    public int maxPerimeter(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-i-1]=temp;
        }
        for(int i=0;i<n-2;i++){
            if(arr[i]<arr[i+1]+arr[i+2]){
                return arr[i]+arr[i+1]+arr[i+2];
            }
        }
        return -1;
    }
}
