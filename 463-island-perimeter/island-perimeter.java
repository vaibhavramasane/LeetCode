class Solution {
    public int islandPerimeter(int[][] g) {
        int peri =0;
        int r = g.length;
        int c = g[0].length;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(g[i][j]==1){
                    if(i==0 || g[i-1][j]==0) {
                        peri++; // up 
                    }
                    if(j==c-1 || g[i][j+1]==0) {
                        peri++; // right
                    }
                    if(j==0 || g[i][j-1]==0) {
                        peri++; // left
                    }
                    if(i==r-1 || g[i+1][j]==0) {
                        peri++;
                    }
                }

            }
        }
        return peri;
        
    }
}