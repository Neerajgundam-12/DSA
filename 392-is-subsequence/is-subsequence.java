class Solution {
    public boolean isSubsequence(String s, String t) {
        int s_n = s.length();
        int t_n = t.length(),k=0;
        if(s.equals(""))
        return true;
       for(int i=0;i<s_n;i++) {
        while(k!=t_n) {
            if(i==s_n-1 && (s.charAt(i)==t.charAt(k)))
            return true;
            if(s.charAt(i)==(t.charAt(k))) {
                k++;
                break;
            }
            k++;
        }
       }
                return false;
    }
}