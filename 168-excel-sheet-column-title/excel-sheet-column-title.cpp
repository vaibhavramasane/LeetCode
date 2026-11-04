class Solution {
public:
    string convertToTitle(int colN) {
        string res;
        while(colN>0){
            colN--;
            res += (colN%26) + 'A';
            colN = (colN)/26;
        }
        reverse(res.begin(),res.end());
        return res;
        
    }
};