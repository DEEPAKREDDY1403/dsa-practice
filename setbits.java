import java.util.*;
import java.util.Scanner;
public class setbits{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int value=14,count=0;
        while(value!=0){
            if((value & 1)==1){
                count=count+1;
            }
            value=value>>1;
        }
        System.out.println(count);
        }
    }

