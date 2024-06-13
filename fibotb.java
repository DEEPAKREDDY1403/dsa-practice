 import java.util.*;
public class fibotb {
    public static void main(String[] args) {
    for(int i:fibo(8)){
        System.err.print(i+" ");
    }
    System.out.println();
    System.out.println(fibo2(20));
    }
    private static int fibo2(int n){
        if(n==0 || n==1){
            return 1;
        }
        return fibo2(n-1)+fibo2(n-2);
    }

    private static int[] fibo(int n) {
       int table[] = new int[n+1];
       table[0]=1;
       table[1]=1;
       for(int i=2;i<table.length;i++){
        table[i]=table[i-1]+table[i-2];
       }
       return table;

    }
   
}