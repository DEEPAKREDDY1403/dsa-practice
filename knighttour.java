import java.util.Arrays;

public class knighttour {
   static int rowIndex[]={1,2,2,1,-1,-2,-2,-1};
   static int colIndex[]={-2,-1,1,2,2,1,-1,-2};
   static int count =1;
    public static void main(String[] args) {
        int n=5;
        int board[][]= new int[n][n];
        knightstour(board, 0,0);
       // knightstour(board,2,2);
        for(int i[]:board){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    private static boolean knightstour( int[][] board,int row,int col) {
       if(count==26){
         return true;
       }
       if(isMovePossible(board,row,col)){
                  board[row][col]=count++;
                  for(int i=0;i<8;i++){
                    int rowi=row+rowIndex[i];
                    int coli=col+colIndex[i];
                    if(knightstour(board, rowi, coli)){
                        return true;
                    }

                  }
                  count-=1;
       board[row][col]=0;
                  return false;
       }
       
       return false;
    }
    private static boolean isMovePossible(int[][] board,int row,int col){
        return row>=0 && row<board.length && col>=0 && col<board.length && board[row][col]==0;
    }
}
