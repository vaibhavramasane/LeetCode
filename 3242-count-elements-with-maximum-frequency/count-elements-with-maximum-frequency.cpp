class Solution {
public:
    int maxFrequencyElements(vector<int>& nums) {
        vector<int>Count(101);
        int maxFreq =0,total=0;
        for(int &n : nums){
            Count[n]++;
            int freq = Count[n];
            if(freq>maxFreq){
                maxFreq = freq;
                total = maxFreq;
            } 
            else if( freq == maxFreq){
                total += maxFreq;
            }
        }
        return total;
        
    }
};