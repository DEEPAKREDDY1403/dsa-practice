import java.util.*;
public class reversebit{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
    int num=sc.nextInt();
    int rev=0;
    while(num!=0){
        rev<<=1;
        if((num&1)==1){
        rev|=1;
        }
        num>>=1;
    }
    System.out.println(rev);
        }
    }   

