class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length,cur_sm=0,mx_sm=Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            cur_sm+=nums[i];
            mx_sm = Math.max(cur_sm,mx_sm);
            if(cur_sm<0)
            cur_sm = 0;
        }
        return mx_sm;
    }
}