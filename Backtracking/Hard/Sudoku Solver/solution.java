class Solution {
    public void solveSudoku(char[][] board) {
        solution(board, 0, 0);
    }
    
    public boolean isSafe(char board[][], int row, int col, char digit){
        //row
        for(int i=0; i<9; i++){
            if(board[row][i] == digit){
                return false;
            }
        }
        //colume
        for(int j=0; j<9; j++){
            if(board[j][col] == digit){
                return false;
            }
        }
        //grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(board[i][j] == digit){
                    return false;
                } 
            }
        }
        return true;
    }
    public boolean solution(char board[][], int row, int col){
        //base case
        if(row == 9){
            return true;
        }
        //recuresion
        int nextRow = row;
        int nextCol = col+1;
        if(col+1 == 9){
            nextRow = row+1;
            nextCol = 0;
        }
        if(board[row][col] != '.'){
            return solution(board, nextRow, nextCol);
        }
        for(char digit='1'; digit<='9'; digit++){
            if(isSafe(board, row, col, digit)){
                board[row][col] = digit;
                if(solution(board, nextRow, nextCol)){
                return true;
                }
            }
            board[row][col] = '.';
        }
        return false;
    }

}