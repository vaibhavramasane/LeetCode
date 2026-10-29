class Solution {
public:
    string toHex(int num) {
        if(num ==0) return "0";
        string hex ="";
        string digit ="0123456789abcdef";
        unsigned int n = num;
        while(n>0){
            int rem = n & 15;
            hex =digit[rem] + hex;
            n=n>>4;
        }
        return hex;
        
    }
};