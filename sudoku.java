import java.util.*;
public class sudoku{
    static int n=4; 
    public static void main(String arg[]){
        int puzzle[][]={{1,0,0,0},{0,2,0,0},{0,0,3,0},{0,0,0,4}};
        solvepuzzle(puzzle);
        for(int i[]:puzzle){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    private static boolean solvepuzzle(int[][] puzzle){
        int posRow=-1,posCol=-1;
        boolean isEmpty=false;;
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                if(puzzle[row][col]==0){
            posRow=row;
            posCol=col;
            isEmpty=true;
            break;
                    }
                }
            }
            if(!isEmpty){
                return true;
            }
            for(int num=1;num<=n;num++){
                if(isNumpossible(puzzle,posRow,posCol,num)){
                    puzzle[posRow][posCol]=num;
                   if(solvepuzzle(puzzle)){
                    return true;
                   }
                   puzzle[posRow][posCol]=0;
                }
            }
             return false;
        }
        private static boolean isNumpossible(int[][] puzzle,int posRow,int posCol,int num){
            // any value in same row and same col
            for(int i=0;i<n;i++){
                if(puzzle[posRow][i]==num || puzzle[i][posCol]==num){
                        return false;
                }
            }
            // submatrrix
            posCol-=posCol%2;
            posRow-=posRow%2;
            for(int i=0;i<n/2;i++){
                for(int j=0;j<n/2;j++){
                        if(puzzle[i+posRow][j+posCol]==num){
                            return false;
                        }
                }
            }
            return true;
        }
    }
