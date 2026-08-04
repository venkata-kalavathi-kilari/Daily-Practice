class Solution {
    public static int countPairs(int arr[], int k) {
        // code here
        int n=arr.length;
        int count=0;
        Arrays.sort(arr);
        int i=0,j=1;
        while(j<n){
            if(arr[j]-arr[i]<k){
                count=count+(j-i);
                j++;
            }else{
                i++;
                if(i==j){
                    j++;
                }
            }
        }
        return count;
    }
}
