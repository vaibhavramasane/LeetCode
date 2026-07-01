class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        solve(1, k, n, new ArrayList<>());
        return result;
    }

    private void solve(int start, int k, int target, List<Integer> temp) {
        if (k == 0 && target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }

        if (k == 0 || target < 0) {
            return;
        }

        for (int i = start; i <= 9; i++) {
            temp.add(i);
            solve(i + 1, k - 1, target - i, temp);
            temp.remove(temp.size() - 1);
        }
    }
}