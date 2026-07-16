class Solution {
   // public int gcdOfOddEvenSums(int n) {
      /*  int sm_odd=1,sm_even=2,cn=1,even_val=2,odd_val=2;
        while(cn!=n) {
            sm_even+=even_val;
           even_val+=2;
            cn++;
        }
        cn=1;
        while(cn!=n) {
            sm_odd+=odd_val;
            odd_val+=2;
            cn++;
        }
        System.out.println(sm_odd);
        System.out.println(sm_even);
        return Gcd(sm_odd,sm_even);
    }
    int Gcd(int a,int b) {
       int r = b%a;
       if(r==0)
       return a;
       return Gcd(r,a);

    }*/
     private int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }

    public int gcdOfOddEvenSums(int n) {
        return gcd(n * n, n * (n + 1));
    }
}