class Solution {
public:
    long long countSubarrays(vector<int>& nums, int minK, int maxK) {
        long long count=0;
        int left=0,lastmin =-1,lastmax =-1,n = nums.size();
        for(int r =0; r<n; r++){
            if(nums[r]<minK || nums[r]>maxK){
                left = r +1;
            }
            count+=r - left +1;
        }
        return count;   
    }
};