import java.util.*;
public class fibodp {
    public static void main(String[] args) {
        HashMap<Integer,Integer> c = new HashMap<>();
        System.out.println(fibo(5,c));
    }
    private static int fibo(int n, HashMap<Integer, Integer> c) {
        if(c.containsKey(n)){
            return c.get(n);
        }
        if(n==0 || n==1){
            return 1;
        }
int result = fibo(n-1,c) +fibo(n-2,c);
c.put(n,result);
return result;       
    }
}
