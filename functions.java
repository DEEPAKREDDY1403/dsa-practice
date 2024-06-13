import java.util.*;
import java.util.Scanner;
public class functions{
    static Scanner sc = new Scanner(System.in); // 
    public static int sum(int a , int b){
        return a+b;
    }
    public static void main(String args[]){
        int c=sum(14,21);
        System.out.println("sum of a and b:"+c);
    }
}