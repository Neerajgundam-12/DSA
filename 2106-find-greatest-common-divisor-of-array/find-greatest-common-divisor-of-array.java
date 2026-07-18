class Solution {
    public int findGCD(int[] nums) {
        int mx=0,mn = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]>mx)
            mx = nums[i];
             if(nums[i]<mn)
            mn = nums[i];
        }
        return gcd(mx,mn);
    }
    int gcd(int a,int b) {
        int r = a%b;
        if(r==0)
        return b;
        return gcd(b,r);
    }
}