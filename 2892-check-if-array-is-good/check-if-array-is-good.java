class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int mx = nums[n-1];
        if(n==1)
        return false;
        if(n!=(mx+1))
        return false;
        for(int i=1;i<n-1;i++) {
            if(nums[i]==nums[i-1])
            return false;
        }
        if(nums[n-2]!=nums[n-1])
        return false;
        return true;
    }
}