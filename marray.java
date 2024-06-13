import java.util.*;
import java.util.Scanner;
public class marray{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int arr[][]={{14,21,35},{03,11,14},{29,01,30}};
        for(int i=0;i<3;i++){
            if(i%2==0){
                for(int j=arr[i].length-1;j>=0;j--){
                    System.out.println(arr[i][j]+"");
                }}
                else{
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]+"");
            }
         
        }

}
        }}


