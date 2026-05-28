class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size(),sm=0,mn=Integer.MAX_VALUE;
        boolean flag = false;
        for(int i=l;i<=r;i++) {
            sm=0;
            for(int j=0;j<i;j++) {
                sm+=nums.get(j);
            }
            if(sm>0) {
                flag = true;
                mn = Math.min(sm,mn);
            }
            for(int k=i;k<n;k++) {
                sm+=nums.get(k) - nums.get(k-i);
                if(sm>0) {
                    flag = true;
                mn = Math.min(sm,mn);
                }
            }
        }
        return flag?mn:-1;
    }
}