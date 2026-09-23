class Solution {
    public int maxFrequencyElements(int[] nums) {
        int maxfreq =0;
        int total =0;
        int Count[] = new int[101];
        for(int n : nums){
            Count[n]++;
            int freq = Count[n];
            if(freq > maxfreq){
                maxfreq = freq;
                total = freq;
            }
            else if(freq == maxfreq){ 
                total += maxfreq;
            }
        }
        return total;
        
    }
}
