class Solution {
    List<List<String>> result = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char [][] board = new char[n][n];
        //intialize
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
        problem(board,0);
        return result;
    }    

        public boolean isSafe(char board[][], int row, int col){
            //vertical up
            for(int i=row-1; i>=0; i--){
                if(board[i][col] == 'Q'){
                    return false;
                }
            }
            //diag left up
            for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
                if(board[i][j] == 'Q'){
                    return false;
                }
            }
            //diag right up
            for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
                if(board[i][j] == 'Q'){
                    return false;
                }
            }
            return true;
        }
        public void problem(char board[][], int row){
            if(row == board.length){
                printBoard(board);
                return;
            }
            for(int j=0; j<board.length; j++){
                if(isSafe(board, row, j)){
                    board[row][j] = 'Q';
                    problem(board, row+1);
                    board[row][j] = '.';
                }
            }
        }
        public void printBoard(char board[][]){
            List<String> result1 = new ArrayList<>();
            for(int i=0; i<board.length; i++){
                String row = new String(board[i]);
                result1.add(row);
            }
        result.add(result1);
    }
}