class Solution {
    public int countOnes(int[] arr) {
        // code here
        int n=arr.length;
        int count=0;
        for(int num:arr){
            if(num==1){
                count++;
            }
        }
        return count;
    }
}
