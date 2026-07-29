class Solution {
    public int majorityElement(int[] nums) {
        int cand=0,cn=0,n=nums.length;
        for(int ele: nums) {
            if(cn==0)
            cand=ele;
            if(ele==cand)
            cn++;
            else
            cn--;
        }
        return cand;
    }
}