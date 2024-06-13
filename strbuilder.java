import java.util.*;
import java.util.Scanner;
public class strbuilder{
    public static void main(String arg[]){
        StringBuilder str=new StringBuilder(10); // default is 16
        str.append("CHARAN  ");
        System.out.println(str.capacity());
        str.append("REDDY");
        str.delete(7,13);
        System.out.println(str);
        str.insert(7,"REDDY");
        System.out.println(str);
        str.replace(0,6,"DEEPAK");
        System.out.println(str);
         System.out.println(str.substring(7));
         System.out.println(str.charAt(7));
         System.out.println(str.reverse()); 
    }
}