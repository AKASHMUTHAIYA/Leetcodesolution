class Solution {
    public boolean issafe(int row, int col, char[][] board, int n) {
        int i, j;
        
        // Check left side of the current row
        for (i = col - 1; i >= 0; i--) {
            if (board[row][i] == 'Q') {
                return false;
            }
        }
        
        // Check upper diagonal on left side
        for (i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        
        // Check lower diagonal on left side
        for (i = row + 1, j = col - 1; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }    
        
        return true; 
    }
    
    public void solve(char[][] board, int col, int n, List<List<String>> result) {
        if (col == n) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                StringBuilder str = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    str.append(board[i][j]);
                }
                list.add(str.toString());
            }
            result.add(list);
            return;
        }
        
        for (int row = 0; row < n; row++) {
            if (issafe(row, col, board, n)) {
                board[row][col] = 'Q';
                solve(board, col + 1, n, result);
                board[row][col] = '.';
            }
        }
    }
    
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        
        solve(board, 0, n, result);
        return result;
    }
}
