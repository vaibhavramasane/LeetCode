class Solution {
public:
    bool detectCapitalUse(string word) {
        //1st cond
        int upper=0;
        for(char ch : word){
            if(ch>='A' && ch<='Z'){
                upper++;
            }
        }
        if(upper == word.length()) return true;
        if(upper == 0) return true;
        if(upper ==1 && word[0]>='A' && word[0]<='Z') return true;
        return false;
        
    }
};