import java.util.*;
public class fibonacci{
    public static void main(String args[]){
        int n=10;
for(int i=0;i<n;i++){     
        System.out.println(fibo(i));
 }
        
    }
    public static int fibo(int n)
    {
        if(n==0|n==1)
        return n;
          return fibo(n-1)+fibo(n-2);
    }
}