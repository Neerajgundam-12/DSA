class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd_sm=1,even_sm=2,cn=1,even_val=2,odd_val=1;
        while(cn!=n) {
            odd_val+=2;
            odd_sm+=odd_val;
            cn++;
        }
        cn=1;
        while(cn!=n) {
            even_val+=2;
            even_sm+=even_val;
            cn++;
        }
        System.out.println(odd_sm);
        System.out.println(even_sm);
        return gcd(odd_sm,even_sm);
    }
    int gcd(int a,int b) {
        int r = b%a;
        if(r==0)
        return a;
        return gcd(r,a);
        
    }
}