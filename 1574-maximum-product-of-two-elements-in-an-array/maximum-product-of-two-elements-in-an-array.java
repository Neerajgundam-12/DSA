class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int mx=0;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                int ans = ((nums[i]-1)*(nums[j]-1));
                mx = Math.max(ans,mx);
            }
        }
        return mx;
    }
}