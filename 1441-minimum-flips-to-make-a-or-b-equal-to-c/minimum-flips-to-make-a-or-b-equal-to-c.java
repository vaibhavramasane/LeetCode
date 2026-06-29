class Solution {
    public int minFlips(int a, int b, int c) {
        int res = (a | b) ^ c;
        Integer p = Integer.bitCount(res);
        Integer q = Integer.bitCount((a&b) & res);
        return p + q;
        
    }
}