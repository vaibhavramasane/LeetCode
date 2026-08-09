class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        util(0, nums, ans);
        return ans;
    }

    private void util(int idx, int[] nums, List<List<Integer>> ans) {
        if (idx == nums.length) {
            List<Integer> list = new ArrayList<>(nums.length);
            for (int num : nums) {
                list.add(num);
            }
            ans.add(list);
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            swap(nums, idx, i);
            util(idx + 1, nums, ans);
            swap(nums, idx, i);
        }
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}