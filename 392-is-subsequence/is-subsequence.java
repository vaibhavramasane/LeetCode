class Solution {
    public boolean isSubsequence(String s, String t) {
        int startp =0;
        int tp =0;
        while(startp <s.length() && tp<t.length()){
            if(s.charAt(startp) == t.charAt(tp)){
                startp++;
            }
            tp++;
        }
        return startp== s.length();
        
    }
}