class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length(); 
        int cn=0,f=0;
        //char[] nw = s.split();
        for(int i=n-1;i>=0;i--) {
            if(s.charAt(i)==' ' && f==0)
            continue;
            else if(s.charAt(i)!=' ') {
                f=1;
            cn++;
            }
            else
            break;
        }
        return cn;
    }
}