class Solution {
public:
    int countCompleteDayPairs(vector<int>& hours) {
        int count =0;
        unordered_map<int,int>rcount;
        for(int h  : hours){
            int rem = h % 24;
            if(rem==0){
                count+=rcount[0];
            }else{
                count+=rcount[24-rem];
            }
            rcount[rem]++;
        }
        return count;
    }
};