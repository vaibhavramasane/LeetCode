class Solution {
    // boolean binarySearch(int nums[], int target){
    //     int l =0,r=nums.length-1;
    //     while(l<=r){
    //         int mid = l+(r-l)/2;
    //         if(nums[mid]==target) return true;
    //         else if(nums[mid]<target) l= mid+1;
    //         else r = mid-1;
    //     }
    //     return false;
    // }
    // public int getCommon(int[] nums1, int[] nums2) {
    //     for(int n : nums1){
    //         if(binarySearch(nums2,n)){
    //             return n;
    //         }
    //     }
    //     return -1;
        
    // }

    // second approach
    public int getCommon(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int i=0,j=0;
        while(i<m && j< n){
            if(nums1[i] == nums2[j]) return nums1[i];
            else if(nums1[i]<nums2[j]) i++;
            else j++;
        }
        return -1;
    }


}