class Solution {
    public int maxCharGap(String s) {
        // code here
        int n=s.length();
        int count=-1;
       for(int i=0;i<n;i++){
           for(int j=n-1;j>i;j--){
               if(s.charAt(i)==s.charAt(j)){
                   count=Math.max(count,j-i-1);
                   break;
               }
           }
       }
       return count;
    }
};
