class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> s1 = new HashSet<Integer>();
        Set<Integer> s2 = new HashSet<Integer>();

        List<List<Integer>> ans = new ArrayList<>();
        
        List<Integer> a1 = new ArrayList<Integer>();
        List<Integer> a2 = new ArrayList<Integer>();

        for(int n : nums1) s1.add(n);
        for(int n : nums2) s2.add(n);

        for(int n : s1){
            if(!s2.contains(n)) a1.add(n);
        }

        for(int n : s2){
            if(!s1.contains(n)) a2.add(n);
        }
        ans.add(a1);
        ans.add(a2);
        return ans;    
        
    }
}