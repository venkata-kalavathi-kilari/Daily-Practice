class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int ans1=nums[n-1]*nums[n-2]*nums[n-3];
        int ans2=nums[0]*nums[1]*nums[n-1];
        int res=Math.max(ans1,ans2);
        return res;
    }
}
