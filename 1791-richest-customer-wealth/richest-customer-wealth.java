class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int acc[] :accounts ){
            int sum=0;
            for(int mon:acc)
            sum+=mon;
            max = Math.max(max,sum);
        }
        return max;
        
    }
}