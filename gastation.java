import java.util.*;

public class gastation{
    public static void main(String[] args) {
       int gas[]={1,2,3,4,5};
       int cost[]={3,4,5,1,2};
       System.out.println(findtour(gas,cost));
    }
    private static int findtour(int[] gas, int[] cost){
        int totalcost=0;
        int totalgas=0;
        int tank=0;
        int index=0;
        for(int i=0;i<gas.length;i++){
            totalgas+=gas[i];
            totalcost+=cost[i];
            tank+=gas[i]-cost[i];
            if(tank<0){       // if the tank value is neg,reset our starrt point index
                index=i+1;
                tank=0;
            }
        }
          if(totalgas>=totalcost){
            return index;
          }
          else{
            return -1;
          }
    }
}