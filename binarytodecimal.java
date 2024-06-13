import java.util.*;
import java.util.Scanner;
public class binarytodecimal{
    public static void main(String arg[]){
        String Binary="10101011";   //171
        StringBuilder str= new StringBuilder(Binary);
        str.reverse();
        int sum=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
            sum+=Math.pow(2,i)*1;
            }
        }
        System.out.println(sum);
    }
}