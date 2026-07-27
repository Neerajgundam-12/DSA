class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int mx=0;
        for(int i=0;i<n;i++) {
        Set<Character> st = new HashSet<>();
           //st.add(s.charAt(i));
            for(int j=i;j<n;j++) {
                char ch = s.charAt(j);
                if(st.contains(ch))
                break;
                st.add(ch);
            int len = j-i+1;
            mx = Math.max(len,mx);
                
            }
        }
            return mx;
    }
}