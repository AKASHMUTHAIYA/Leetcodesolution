class Solution 
{
    public boolean solve(char[][] board,String word,int n,int m,int row,int col,int i)
    {
        if(i==word.length())
        {
            return true;
        }
        if(row<0||col<0||row>=n||col>=m|| board[row][col]!=word.charAt(i) || board[row][col]=='*')
        {
            return false;
        }
        else
        {
            char temp=board[row][col];
            board[row][col]='*';
            boolean result=solve(board,word,n,m,row-1,col,i+1)||solve(board,word,n,m,row,col+1,i+1)||
                           solve(board,word,n,m,row+1,col,i+1)||solve(board,word,n,m,row,col-1,i+1);
            board[row][col]=temp;
            return result;
        }
    }
    public boolean exist(char[][] board, String word)
    {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(solve(board,word,n,m,i,j,0))
                {
                    return true;
                }
            }
        }
        return false;
    }
}