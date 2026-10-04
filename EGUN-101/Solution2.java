class Solution {    
    int firstOccurence(int[] arr, int target) {
        int n=arr.length;
        int low=0,high=n-1;
        int first=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                first=mid;
                high=mid-1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return first;
    }
    
    int lastOccurence(int[] arr, int target) {
        int low=0,high=arr.length-1;
        int last=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                last=mid;
                low=mid+1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return last;
    }

    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int first=firstOccurence(arr,x);
        int last=lastOccurence(arr,x);
        ans.add(first);
        ans.add(last);
        return ans;
    }
}
