import java.util.*;
import java.util.Scanner;
public class msb{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int msb=0;
        while(num!=0){
            msb=num; // keeping track of last bit
            num>>= 1;
        }
       // System.out.println(Integer.toBinaryString(msb));
        System.out.println(msb);

        
        }
    }

