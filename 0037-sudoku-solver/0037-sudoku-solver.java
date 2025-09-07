class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    boolean solve(char[][] board){
        for(int i =0; i<9;i++){
            for(int j =0; j<9;j++){
                 if(board[i][j]=='.'){
                        for(char num ='1' ; num<='9';num++){
                            if(isvalid(i,j,num,board)){
                                board[i][j]=num;
                                if(solve(board)) return true;
                                board[i][j]='.';
                            }

                        }
                        return false;
                 }
            }
        }
        return true;
    }
    boolean isvalid(int row,int col, char num , char[][]board){
        for(int i =0; i<9;i++){
            if(board[row][i]==num || board[i][col]==num || board[3*(row/3) + i/3][3*(col/3) + i%3] ==num ) return false;
        }
        return true;
    }
}