
import java.util.*;
import java.util.Scanner;
public class toggle{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a,k;
        System.out.println("enter a and k");
        a=sc.nextInt();
        k=sc.nextInt();
        System.out.println("value after toggling:");
        System.out.println(a^(1<<(k-1)));

    }

}


