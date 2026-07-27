class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int mx1=0,mx2=0;
        Arrays.sort(nums);
        return (nums[n-2]-1)*(nums[n-1]-1);
    }
}