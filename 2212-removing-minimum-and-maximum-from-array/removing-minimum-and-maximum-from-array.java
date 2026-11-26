class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int minindex =0;
        int maxindex =0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
                maxindex = i;
            }
            if(nums[i]<min){
                min = nums[i];
                minindex = i;
            }
        }
        int left = Math.min(maxindex,minindex);
        int right = Math.max(maxindex,minindex);


        int n = nums.length;

        // Three possible approaches
        int option1 = right + 1;
        int option2 = n - left;
        int option3 = (left + 1) + (n - right);

        return Math.min(option1, Math.min(option2, option3));


        
    }
}