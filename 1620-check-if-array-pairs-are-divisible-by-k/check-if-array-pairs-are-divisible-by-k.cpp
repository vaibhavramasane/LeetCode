class Solution {
public:
    bool canArrange(vector<int>& arr, int k) {
        vector<int>mp(k,0);
        for(int &n : arr){
            int rem = (n %k + k) % k;
            mp[rem]++;
        }
        if(mp[0]%2!=0){
            return false;
        }
        for(int rem =1; rem<=k/2; rem++){
            int currhalf = k - rem;
            if(mp[currhalf]!=mp[rem]){
                return false;
            }
        }
        return true;
        
    }
};