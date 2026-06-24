class Solution {
    public int maxNumberOfBalloons(String text) {
        int freq[] = new int[26];
        for(char c : text.toCharArray()){
            freq[c-'a']++; 
        }

        int min = freq['b'-'a'];
        min = Math.min(freq['a'-'a'],min);
        min = Math.min(freq['l'-'a']/2,min);
        min = Math.min(freq['o'-'a']/2,min);
        min = Math.min(freq['n'-'a'],min);
        return min; 
    }
}