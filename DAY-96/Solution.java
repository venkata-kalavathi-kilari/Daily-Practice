class Solution {
    public int kthSmallest(int[][] mat, int k) {
        int n=mat.length;
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr.add(mat[i][j]);
            }
        }
        Collections.sort(arr);
        return arr.get(k-1);
    }
}
