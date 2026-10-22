// class Solution {
// public:
//     int countPairs(vector<int>& nums, int target){
//         int count =0;
//         for(int i=0; i<nums.size(); i++){
//             for(int j=i+1; j<nums.size(); j++){
//                 if(nums[i] + nums[j]<target){
//                     count++;
//                 }
//             }
//         }
//         return count;
        
//     }
// };

class Solution {
public:
    int countPairs(vector<int>& nums, int target){
        sort(nums.begin(),nums.end());
        int left=0,count=0,right=nums.size()-1;
        while(left<right){
            if(nums[left] + nums[right] <target){
                count+= (right-left);
                left++;
            }else{
                right--;
            }
        }
        return count;
    }
};


