class Solution {
    public int strStr(String haystack, String needle) {
        int h = haystack.length(),n = needle.length();
       int i=0;
       while(i<(h-n+1)) {
        if(haystack.charAt(i)==needle.charAt(0)) {
         if((haystack.substring(i,i+n)).equals(needle)) {
            return i;
         }

        }
        i++;
       }
       return -1;
    }
}