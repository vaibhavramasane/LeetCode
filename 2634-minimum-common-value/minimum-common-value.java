class Solution {
    boolean binarySearch(int nums[], int target){
        int l =0,r=nums.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]==target) return true;
            else if(nums[mid]<target) l= mid+1;
            else r = mid-1;
        }
        return false;
    }
    public int getCommon(int[] nums1, int[] nums2) {
        for(int n : nums1){
            if(binarySearch(nums2,n)){
                return n;
            }
        }
        return -1;
        
    }
}