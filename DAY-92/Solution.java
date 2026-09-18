class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n=arr.length;
        int rep=-1;
        int miss=-1;
        int freq[]=new int[n+1];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        for(int i=0;i<=n;i++){
            if(freq[i]==0){
                miss=i;
            }
            else if(freq[i]==2){
                rep=i;
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        res.add(rep);
        res.add(miss);
        return res;
    }
}
