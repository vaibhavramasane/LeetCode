class Solution {
public:
    vector<int> luckyNumbers(vector<vector<int>>& matrix) {
        int m = matrix.size();
        int n = matrix[0].size();
        vector<int> rowmin(m);
        vector<int> colmax(n);

        for(int i=0; i<m; i++){
            int minele = INT_MAX;
            for(int j=0; j<n; j++){
                minele = min(minele,matrix[i][j]);
            }
            rowmin[i] = minele;
        }
        vector<int>result;
        for(int j=0; j<n; j++){
            int maxele =INT_MIN;
            for(int i=0; i<m; i++){
                maxele = max(maxele,matrix[i][j]);
            }
            colmax[j] = maxele;
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]==rowmin[i] && matrix[i][j]==colmax[j]){
                    result.push_back(matrix[i][j]);
                }
            }
        }
        return result;
    }
};