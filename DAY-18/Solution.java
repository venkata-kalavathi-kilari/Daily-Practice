class Solution {
    public static ArrayList<Integer> divFloorCeil(int a, int b) {
        int floorVal = (int) Math.floor((double) a / b);
        int ceilVal = (int) Math.ceil((double) a / b);
        
        ArrayList<Integer> res = new ArrayList<>();
        res.add(floorVal);
        res.add(ceilVal);

        return res;
    }
