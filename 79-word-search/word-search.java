class Solution {
    static boolean solve(char[][]board,int row,int col,String word,int ind)
    {
        int r=board.length;
        int c=board[0].length;
        if(ind==word.length())
            return true;
        
        if(row<0 || row>=r ||col<0 || col>=c || board[row][col]!=word.charAt(ind) || board[row][col]=='@')
            return false;
        char ch=board[row][col];
        board[row][col]='@';

        boolean top= solve(board,row-1,col,word,ind+1);
        boolean right= solve(board,row,col+1,word,ind+1);
        boolean bottom = solve(board,row+1,col,word,ind+1);
        boolean left= solve(board,row,col-1,word,ind+1);

        board[row][col]=ch;
        return top || right || bottom || left;  
    }
    public boolean exist(char[][] board, String word) {
        int i,j;
        int ind=0;
        for(i=0;i<board.length;i++)
        {
            for(j=0;j<board[0].length;j++)
            {
                if(board[i][j]==word.charAt(ind))
                    if(solve(board,i,j,word,ind))
                    {
                        return true;
                    }
            }
        }
        return false;
    }
}