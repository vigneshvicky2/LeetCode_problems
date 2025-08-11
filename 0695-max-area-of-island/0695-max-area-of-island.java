class Solution {
    int best =0;
    int len =0;
    public int maxAreaOfIsland(int[][] grid) {
        for(int i = 0; i< grid.length ;i++){
            for(int j=0; j< grid[0].length ;j++){
                if(grid[i][j]==1){
                    dfs(i,j,grid);
                }
                len =0;
            }
        }
        return best;        
    }
    void dfs(int i , int j, int[][] grid){
        if( i<0 || j< 0 || i>=grid.length ||j>=grid[0].length  || grid[i][j]==0) return;
        len++;
        grid[i][j]=0;
        best = Math.max(best,len);
        dfs(i+1,j,grid);
        dfs(i,j+1,grid);
        dfs(i-1,j,grid);
        dfs(i,j-1,grid);
    }
}