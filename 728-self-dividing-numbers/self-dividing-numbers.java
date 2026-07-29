class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> lst = new ArrayList<>();
        for(int i=left;i<=right;i++) {
            if(is_self_div(i))
            lst.add(i);
        }
        return lst;
    }
    boolean is_self_div(int n) {
        int w = n;
        while(n!=0) {
            int k = n%10;
            if(k==0 || w%k!=0)
            return false;
            n = n/10;
        }
        return true;
    }
}