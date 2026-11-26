class Solution {
public:
    int minimumDeletions(vector<int>& a) {
        int max = INT_MIN;
        int min = INT_MAX;
        int minIdx = 0,maxIdx=0;
        for(int i=0; i<a.size(); i++){
            if(a[i]>max){
                max=a[i];
                maxIdx = i;

            }
            if(a[i]<min){
                min =a[i];
                minIdx = i;

            }
        }
        int left = std::min(maxIdx,minIdx);
        int right = std::max(maxIdx,minIdx);
        int n = a.size();
        int opt1= right+1,opt2=n-left,opt3=(left+1) + (n-right);
        return std::min(opt1,std::min(opt2,opt3));
    }
};