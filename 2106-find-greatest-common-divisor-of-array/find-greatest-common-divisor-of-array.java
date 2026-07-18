class Solution {
    public int findGCD(int[] nums) {
        int mx=0,mn = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]>mx)
            mx = nums[i];
             if(nums[i]<mn)
            mn = nums[i];
        }
        return gcd(mn,mx);
    }
    int gcd(int a,int b) {
        int r = b%a;
        if(r==0)
        return a;
        return gcd(r,a);
    }
}