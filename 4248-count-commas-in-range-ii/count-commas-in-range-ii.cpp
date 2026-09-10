#define ll long long
class Solution {
public:
    long long countCommas(long long n) {
        ll lower =1000;
        ll comma = 1;
        ll result =0;
        while(lower<=n){
            ll upper = (lower * 1000 )-1;
            if(upper>n){
                upper = n;
            }
            ll countnos = (upper - lower) + 1;
            result += (countnos * comma);
            
            comma += 1;
            lower *= 1000;
        }
        return result;
        
    }
};