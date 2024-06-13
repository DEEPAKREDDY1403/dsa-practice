import java.util.*;
import java.util.Scanner;
public class peak{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
            for(int i=1;i<arr.length-1;i++){
                    if(arr[i+1]<arr[i] && arr[i-1]<arr[i]) 
                    {
                        System.out.println(i);
            }
           
        }
    }
}

