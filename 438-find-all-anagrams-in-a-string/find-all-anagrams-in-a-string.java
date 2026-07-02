class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> lst = new ArrayList<>();
        int n = s.length(),k= p.length();
      int freq[] = new int[26];
        for(int i=0;i<k;i++) {
            freq[p.charAt(i) - 'a']++;
        }
        for(int i=0;i<n-k+1;i++) {
       int scount[] = new int[26];
      for(int j=i;j<i+k;j++) {
        scount[s.charAt(j) - 'a']++;
      }      
      if(Arrays.equals(freq,scount))
      lst.add(i);
        }
        return lst;
    }
}