import java.util.*;
import java.util.Scanner;
public class sumofarray{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int arr[]= new int[5] ;// size of array is 20 bytes
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
             arr[i]=sc.nextInt();
             sum=sum+arr[i];
        }
        System.out.println(sum);
        }
    }

