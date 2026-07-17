class Solution {
public:
    int arraySign(vector<int>& nums) {
        int NegCount =0;
        for(int x : nums){
            if(x==0) return 0;
            if(x<0) NegCount++;
        }
        return (NegCount % 2==0)?1:-1;
        
    }
};