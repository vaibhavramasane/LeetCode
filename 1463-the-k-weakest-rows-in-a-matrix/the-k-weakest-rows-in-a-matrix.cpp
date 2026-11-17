
class Solution {
public:
    typedef pair<int,int> P;

    int binarySearch(vector<int>& arr, int l, int r) {
        while(l <= r) {
            int mid = l + (r - l) / 2;

            if(arr[mid] == 1) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }

        return l;
    }

    vector<int> kWeakestRows(vector<vector<int>>& mat, int k) {
        int m = mat.size();
        int n = mat[0].size();

        vector<P> countOnes;

        for(int row = 0; row < m; row++) {
            int numOnes = binarySearch(mat[row], 0, n - 1);

            countOnes.push_back({numOnes, row});
        }

        sort(begin(countOnes), end(countOnes));

        vector<int> res(k);

        for(int i = 0; i < k; i++) {
            res[i] = countOnes[i].second;
        }

        return res;
    }
};
