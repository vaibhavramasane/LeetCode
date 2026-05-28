class Solution {
    public int largestAltitude(int[] gain) {
        int a =0,maxn = 0;
        for(int i : gain){
            a+=i;
            maxn = Math.max(maxn,a);
        }
        return maxn;
        
    }
}