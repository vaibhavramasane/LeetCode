class Solution {
    public int longestSubarray(int[] nums) {
        int left=0,maxl=0,lastzero=-1;
        for(int right =0; right<nums.length; right++){
            if(nums[right] ==0){
                left = lastzero + 1;
                lastzero = right;
            }
            maxl=Math.max(maxl,right-left);     
        }
        return maxl;   
    }
    
}