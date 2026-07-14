class Solution {
    public boolean isPalindrome(String s) {
     StringBuilder sb = new StringBuilder();
   //  int n = s.length();
     for(char ch: s.toCharArray()) {
        if(Character.isLetterOrDigit(ch)) {
            sb.append(Character.toLowerCase(ch));
        }
     }
     boolean ans = check_same(sb.toString(),0,sb.length()-1,sb.length()); 
     return ans;
    }
    static boolean check_same(String st,int start,int end,int n) {
        if(start>=n || end<0)
        return true;
            if(st.charAt(start)!=st.charAt(end)) {
                return false;
            }
            start++;
            end--;
            return check_same(st,start,end,n);
    }
}