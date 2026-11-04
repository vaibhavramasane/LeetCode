class Solution {
public:
    int titleToNumber(string columnTitle) {
        int res =0;
        for(char ch : columnTitle){
            int digit = ch-'A' + 1;
            res = res*26 + digit;
        }
        return res;
        
    }
};