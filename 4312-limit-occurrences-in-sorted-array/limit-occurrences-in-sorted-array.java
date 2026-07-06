class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        List<Integer> lt = new ArrayList<>();
        int count[] = new int[101];
        for(int i=0; i<nums.length; i++){
            if(count[nums[i]]<k){
                count[nums[i]]++;
                lt.add(nums[i]);

            }
        }
        int ans[]  = new int[lt.size()];
        for(int i=0; i<lt.size(); i++){
            ans[i] = lt.get(i);
        }
        return ans;
        
    }
}