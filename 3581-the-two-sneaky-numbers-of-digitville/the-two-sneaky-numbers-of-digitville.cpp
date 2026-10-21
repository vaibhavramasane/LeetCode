class Solution {
public:
    vector<int> getSneakyNumbers(vector<int>& nums) {
        int n = nums.size();
        vector<int>ans;
        unordered_map<int,int>map;
        
        for(int x : nums){
            map[x]++;
            if(map[x]==2){
                ans.push_back(x);
            }
        }
        return ans;
    }
};