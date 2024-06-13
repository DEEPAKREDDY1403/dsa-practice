import java.util.*;
public class stairstb{
    public static void main(String[] args) {
        int n=6;
        System.out.println(findsteps(n));
    }
    private static int findsteps(int n){
        int stairs[]=new int[n+1];
        stairs[1]=1;
        stairs[2]=2;
        for(int i=3;i<=n;i++){
            stairs[i]=stairs[i-1]+stairs[i-2];
        }
        return stairs[n];
    }
}