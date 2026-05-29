class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        if(n==0) return -1;
        int Lsum =0,Rsum=0;
        for(int num : nums)
            Rsum +=num;
        for(int i=0; i<n; i++){
            Rsum -=nums[i];
            if(Rsum==Lsum) return i;
            Lsum +=nums[i];
        }
        return -1;
        
    }
}