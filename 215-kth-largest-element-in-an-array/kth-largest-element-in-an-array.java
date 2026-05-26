class Solution {
    public int findKthLargest(int[] nums, int k) {
        //Collections.sort(nums,Collections.reverseOrder());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele: nums) {
            pq.add(ele);
        }
        while((k-1)!=0) {
        pq.remove();
    k--;
        }
        int ele = pq.remove();

        return ele; 
    }
}