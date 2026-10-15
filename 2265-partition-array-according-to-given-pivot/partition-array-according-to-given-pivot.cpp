class Solution {
public:
    vector<int> pivotArray(vector<int>& nums, int pivot) {
        int n = nums.size();

        vector<int>LessP;
        vector<int>EqualTo;
        vector<int>GreatP;

        for(int i=0; i<n; i++){
            if(nums[i]<pivot)LessP.push_back(nums[i]);
            else if(nums[i]==pivot) EqualTo.push_back(nums[i]);
            else GreatP.push_back(nums[i]);
        }
        for(int &num :EqualTo){
            LessP.push_back(num);
        }
         for(int &num :GreatP){
            LessP.push_back(num);
        }
        return LessP;
        
    }
};