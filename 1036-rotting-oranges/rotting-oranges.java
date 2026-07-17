class Solution {
    public int orangesRotting(int[][] g) {
        if(g == null || g.length ==0) return -1;
        for(int i=0; i<g.length; i++){
            for(int j=0; j<g[0].length; j++){
                if(g[i][j]==2) RotAdj(g,i,j,2);
            }
        }
        int min = 2;
        for(int [] row : g){
            for(int cell : row){
                if(cell==1) return -1;
                min = Math.max(min,cell);
            }
        }
        return min -2;    
    }
    private void RotAdj(int [][] g,int i,int j,int min){
        if(i<0 || i>=g.length || j<0 || j>=g[0].length || g[i][j]==0 || (1<g[i][j]&&g[i][j]<min)) return;
        else{
            g[i][j] = min;
            RotAdj(g,i-1,j,min+1);
            RotAdj(g,i+1,j,min+1);
            RotAdj(g,i,j-1,min+1);
            RotAdj(g,i,j+1,min+1);

        }
    }
}