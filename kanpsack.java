import java.util.*;
public class kanpsack {
    public static void main(String[] args) {
        int weights[]={2,3,4,5};
        int values[]={3,4,5,7};
        int w=7;
        int n=weights.length;
        int M[][]=new int[n+1][w+1];
        for(int i=1;i<=n;i++){
            for(int weight=1;weight<=w;weight++){
                if(weight>=weights[i-1]){
                M[i][weight]=Math.max(M[i-1][weight],M[i-1][weight-weights[i-1]]+values[i-1]);
            }
            else{
                M[i][weight]=M[i-1][weight];
            }
        }
        }
        System.out.println(M[n][w]);
    }
}
