class Solution {
public:
    int singleNumber(vector<int>& nums) {
        unordered_map<int,int> map;
        for(auto n:nums) map[n]++;
        for(auto n:map){
            if(n.second ==1){
                return n.first;
            }
        }
        return -1;
        
    }
};