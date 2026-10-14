class Solution {
public:
    int furthestDistanceFromOrigin(string moves) {
        int l=0,r=0,space=0;
        for(char ch : moves){
            if(ch=='L') l++;
            else if(ch=='R') r++;
            else space++;
        }
        return abs(l-r) + space;
        
    }
};