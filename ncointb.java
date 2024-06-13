import java.util.*;
public class ncointb {
  public static void main(String[] args) {
    int coins[]={1,2,5},sum=5,n=3;
    System.out.println(findcomb(coins,sum,n));
  }
  private static int findcomb(int[] coins,int sum,int n){
   int table[]= new int[sum+1];
   table[0]=1;
   for(int coin:coins){
    for(int i=coin;i<=sum;i++){
        table[i]=table[i]+table[i-coin];
    }
   }
   return table[sum];
}
}
