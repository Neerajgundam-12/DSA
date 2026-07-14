class Solution {
    public boolean isPalindrome(String s) {
       s= s.toLowerCase();
        String st1 = "";
        for(char ch: s.toCharArray()) {
            if(Character.isAlphabetic(ch) ||  Character.isDigit(ch)) {
                st1+=ch;
            }
        }
        int n = st1.length();
        int i = 0,j=n-1; 
        while(i<j && j>=0 && i<n) {
            if(st1.charAt(i)!=st1.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
}