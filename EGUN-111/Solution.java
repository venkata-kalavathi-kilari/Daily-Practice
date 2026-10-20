class Solution {
    public int findDays(int[] weights,int cap){
       int days=1,load=0;
        for(int i=0;i<weights.length;i++){
            if(weights[i]+load>cap){
                days+=1;
                load=weights[i];
            }else{
                load+=weights[i];
            }
        }
        return days;
    }
    public int leastWeightCapacity(ArrayList<Integer> arr, int d) {
        // code here
        int n = arr.size();

        int[] weights = new int[n];
        int low = 0, high = 0;

        for (int i = 0; i < n; i++) {
            weights[i] = arr.get(i);
            low = Math.max(low, weights[i]);
            high += weights[i];
        }
        while(low<=high){
            int mid=(high+low)/2;
            int no_of_days=findDays(weights,mid);
            if(no_of_days<=d){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}
