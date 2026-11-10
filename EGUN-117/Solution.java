class Solution {
    void segregate0and1(int[] arr) {
        // code here
       int n=arr.length;
       int Zero=0;
       int one=0;
       for(int i=0;i<n;i++){
           if(arr[i]==0){
               Zero++;
           }else{
               one++;
           }
       }
       
       for(int i=0;i<Zero;i++){
           arr[i]=0;
       }
       for(int j=Zero;j<n;j++){
           arr[j]=1;
       }
      
    }
}
