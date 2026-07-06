class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int tar = nums.length/2;
        int count=0;
        for(int num : nums){
            if(num==nums[tar]) count++;
            if(count>1) return false;
        }
        return true;  
    }
}