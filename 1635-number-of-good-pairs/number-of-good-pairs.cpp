class Solution {
public:
    int numIdenticalPairs(vector<int>& nums) {
        int n = nums.size();
        int ans=0;
        unordered_map<int,int> count;
        for(int num : nums){
            ans+=count[num]++;
        }
        return ans;
        
    }
};