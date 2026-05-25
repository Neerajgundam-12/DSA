class Solution {
    public int[] findOrder(int n, int[][] prerequisites) {
        Map<Integer,List<Integer>> mp = new HashMap<>();
       // int topolog[] = new int[n];
       int[] topolog = new int[n]; 
       Set<Integer> st = new HashSet<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int k=0;
        for(int i=0;i<n;i++) {
            mp.put(i,new ArrayList<>());
        }
        int indegree[] = new int[n];
        for(int i=0;i<prerequisites.length;i++) {
            int u = prerequisites[i][1];
            int v = prerequisites[i][0];
            indegree[v]++;
            mp.get(u).add(v);
        }
        for(int i=0;i<n;i++) {
            if(indegree[i]==0)
            pq.add(i);
        }
        while(!pq.isEmpty()) {
            int ele = pq.remove();
            topolog[k++] = ele;
            for(int w: mp.get(ele)) {
                indegree[w]--;
                if(indegree[w]==0)
                pq.add(w);
            }
        }
       for(int ele: topolog) {
        if(st.contains(ele))
        return new int[0];
        st.add(ele);
       }
       /* int arr[] = new int[1];
        arr[0] = -1;*/
       /* if((st.size()==1 && n!=1) || topolog.length!
        return new int[0];*/
        return topolog;
        
    }
}