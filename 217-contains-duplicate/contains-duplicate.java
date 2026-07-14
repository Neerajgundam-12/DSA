class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int ele: nums) {
            if(st.contains(ele)) {
                return true;
            }
            st.add(ele);
        }
        return false;
    }
}