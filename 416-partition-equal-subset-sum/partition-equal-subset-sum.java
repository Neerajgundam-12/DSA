class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length,sm=0;
        for(int ele: nums)
        sm+=ele;
        if(sm%2!=0)
        return false;
        int trg = sm/2;
        Boolean dp[][] = new Boolean[n][trg+1];
        sm=0;
        boolean ans = helper(dp,nums,sm,trg,0);
        return ans;
    }
    boolean helper(Boolean dp[][],int[] a,int sm,int trg,int pos) {
        if(sm==trg)
        return true;
        if(pos>=a.length || sm>trg)
        return false;
        if(dp[pos][sm]!=null)
        return dp[pos][sm];
        return dp[pos][sm] = helper(dp,a,sm+a[pos],trg,pos+1) || helper(dp,a,sm,trg,pos+1);
    }
}