import java.util.*;
public class stockspan {
         public static void main(String[] args) {
            int price[] = { 13,15,12,14,16,8,6,4,10,30 };
            int n = price.length;
            int S[] = new int[n];
            calculateSpan(price, n, S);
            System.out.print(Arrays.toString(S));
         }   
         static void calculateSpan(int price[], int n, int S[])
{
    S[0] = 1;
    for (int i = 1; i < n; i++) { // if a[i]<a[i-1] then s[i]=2
        S[i] = 1;
        for (int j = i - 1;(j >= 0) && (price[i] >= price[j]); j--)   // left traverse 
       S[i]++;
}
}

}
