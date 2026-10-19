
class Solution {
public:
    vector<int> sortArray(vector<int>& nums) {
        unordered_map<int, int> m;

        for (int& num : nums) {
            m[num]++;
        }

        int minEle = *min_element(nums.begin(), nums.end());
        int maxEle = *max_element(nums.begin(), nums.end());

        int i = 0;

        for (int num = minEle; num <= maxEle; num++) {
            while (m[num] > 0) {
                nums[i] = num;
                i++;
                m[num]--;
            }
        }

        return nums;
    }
};
