class Solution {
public:
    vector<int> separateDigits(vector<int>& nums) {
        vector<int>st;
        for(int i = nums.size()-1; i>=0; i--){
            int n = nums[i];
            while(n>0){
                int rem = n % 10;
                st.push_back(rem);
                n= n/10 ;
            }
            
        }
        reverse(st.begin(),st.end());
    return st;
        
    }
};