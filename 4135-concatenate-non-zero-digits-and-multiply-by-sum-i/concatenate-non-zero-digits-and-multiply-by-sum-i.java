class Solution {
    public long sumAndMultiply(int n) {
        long x = 0,sm=0;
        String s = String.valueOf(n);
        for(char ch: s.toCharArray()) {
            int ele = ch - '0';
            sm+=ele;
            if(ele>0)
            x = (x*10)+ele;
        }
        return x*sm;
    }
}