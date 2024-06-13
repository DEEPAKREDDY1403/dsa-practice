import java.util.*;
public class ncoin {
  public static void main(String[] args) {
    int coins[]={1,2,5},sum=5,n=3;
    System.out.println(findcomb(coins,sum,n));
  }
  private static int findcomb(int[] coins,int sum,int n){
    if(sum==0){
        return 1;
    }
    if(n<=0){
        return 0;
    }
    if(sum<0){
        return 0;
    }
    return findcomb(coins, sum, n-1) + findcomb(coins, sum-coins[n-1], n);
  }
}
