class Solution {
    public int minDistance(String word1, String word2) {
        int[][] ans = new int[word1.length() + 1][word2.length() + 1];

        for (int i = 0; i <= word1.length(); i++) {
            for (int j = 0; j <= word2.length(); j++) {
                ans[i][j] = -1;
            }
        }

        return dp(word1, word2, word1.length(), word2.length(), ans);      
    }

    private int dp(String word1, String word2, int i, int j, int[][] ans) {
        if (i == 0) return j;
        if (j == 0) return i;
        if (ans[i][j] != -1) return ans[i][j];

        if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
            ans[i][j] = dp(word1, word2, i - 1, j - 1, ans);
        } else {
            ans[i][j] = 1 + Math.min(
                dp(word1, word2, i - 1, j, ans),        // Delete
                Math.min(
                    dp(word1, word2, i, j - 1, ans),    // Insert
                    dp(word1, word2, i - 1, j - 1, ans) // Replace
                )
            );
        }

        return ans[i][j];
    }   
}