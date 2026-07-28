class Solution {
    public static boolean isSorted(ArrayList<Integer> arr) {
        // code here
        boolean ase=true;
        boolean des=true;
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)>arr.get(i+1)){
                ase=false;
            }
            if(arr.get(i)<arr.get(i+1)){
                des=false;
            }
        }
        return ase||des;
    }
}
