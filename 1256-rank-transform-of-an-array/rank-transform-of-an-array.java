class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int a[] = new int[n];
        Map<Integer,Integer> mp = new TreeMap<>();
        Set<Integer> st = new TreeSet<>();
        for(int ele: arr)
        st.add(ele);
        int rank=1;
        for(int ele: st) {
            mp.put(ele,rank);
            rank++;
        }
        for(int i=0;i<n;i++) {
            int ele = arr[i];
            int ind = mp.get(ele);
            a[i] = ind;
        }
        return a;
    }
}