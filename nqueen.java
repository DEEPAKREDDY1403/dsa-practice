public class nqueen {
    static int n=4;
    public static void main(String[] args) {
        int board[][]={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        nqueens(board,0);
        for(int i[]:board){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    private static boolean nqueens(int[][] board, int queen) {
       //check if there is a possible pos(left dig,right dig , no queen in same col)
        if(queen==n){
            return true;
        }
        for(int row=0;row<n;row++){
            if(isMovePossible(board,row,queen)){
                    board[row][queen]=1;
                    if(nqueens(board, queen+1)){
                        return true;
                    }
                    board[row][queen]=0;
                 } 
            }
        return false;

    }
    private static boolean isMovePossible(int[][] board, int row, int queen) {
        // check queen in col
        for(int i=0;i<queen;i++){
            if(board[row][i]==1){
                return false;
            }
        }
         // upper dig of left
         for(int i=row,j=queen;i>=0 && j>=0;i--,j--){
            if(board[i][j]==1){
                return false;
            }
         }
         // lower dig to left
         for(int i=row,j=queen;i<n && j>=0;i++,j--){
            if(board[i][j]==1){
                return false;
            }
         }
         return true;
    }
      
}
