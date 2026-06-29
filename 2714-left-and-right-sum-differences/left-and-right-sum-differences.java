class Solution {
    public int[] leftRightDifference(int[] nums) {
        int curr = 0; // cummulative sum(leftsum)
        int k = nums.length;
        int result[]= new int[k];
        int totalsum =0;
        for(int n : nums){
            totalsum += n;
        }
        
        for(int i=0; i<nums.length; i++){
            int leftsum = curr;
            curr += nums[i];
            int rightsum = totalsum - curr;
            result[i] = Math.abs(rightsum - leftsum);
        }  
        return result;
    }
}