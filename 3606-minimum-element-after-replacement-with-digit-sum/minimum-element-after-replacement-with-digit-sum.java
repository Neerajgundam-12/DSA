class Solution {
    public int minElement(int[] nums) {
        int mn = Integer.MAX_VALUE;
        for(int ele: nums) {
            int sm=0;
            while(ele!=0) {
                sm+=(ele%10);
                ele/=10;
            }
            mn = Math.min(sm,mn);
        }
        return mn;
    }
}