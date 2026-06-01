class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int ans = 0;
        int dp[][] = new int[text1.length()][text2.length()];
        for(int i=0;i<text1.length();i++)
        Arrays.fill(dp[i],-1);
        ans = helper(text1,text2,0,0,dp); 
        return ans;      
    }
  int helper(String text1, String text2,int i,int j,int[][] dp) {
    if(i>=text1.length() || j>=text2.length())
    return 0;
    if(dp[i][j]!=-1)
    return dp[i][j];
        if(text1.charAt(i)==text2.charAt(j))
        return dp[i][j] = 1+helper(text1,text2,i+1,j+1,dp);
        else {
            int left = helper(text1,text2,i+1,j,dp);
            int right = helper(text1,text2,i,j+1,dp);
            return dp[i][j] = Math.max(left,right);
        }
  }  
}