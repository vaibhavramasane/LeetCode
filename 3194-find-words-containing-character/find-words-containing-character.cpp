class Solution {
public:
    vector<int> findWordsContaining(vector<string>& words, char x) {
        
        vector<int> len;
        for(int i=0; i<words.size(); i++){
            if(words[i].find(x)!=string::npos){
                len.push_back(i);
            }

        }
        return len; 
    }
};