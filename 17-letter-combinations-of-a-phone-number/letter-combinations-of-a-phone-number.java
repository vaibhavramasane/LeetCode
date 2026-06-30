class Solution {
    String[] Map = {
        "", "", "abc", "def", "ghi", "jkl",
        "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        if (digits.length() == 0)
            return ans;

        BTrack(ans, new StringBuilder(), digits, 0);
            return ans;
    }

    private void BTrack(List<String> ans, StringBuilder sb, String digits, int idx) {
        if (idx == digits.length()) {
            ans.add(sb.toString());
            return;
        }
        String letters = Map[digits.charAt(idx) - '0'];
        for (char ch : letters.toCharArray()) {
            sb.append(ch);
            BTrack(ans, sb, digits, idx + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}