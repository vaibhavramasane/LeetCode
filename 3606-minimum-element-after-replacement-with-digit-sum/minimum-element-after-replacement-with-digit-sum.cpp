class Solution {
public:
    int minElement(vector<int>& nums) {
         vector<int>st;
         int ans = INT_MAX;
        for(int i = nums.size()-1; i>=0; i--){
            int n = nums[i];
            int sum =0;
            while(n>0){
                int rem = n % 10;
                sum+=rem;
                n= n/10 ;
            }
            ans = min(ans,sum);
            
        }
        
        return ans;
    }
};