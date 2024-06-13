import java.util.*;
public class sumofadj_min {
    public static void main(String[] args) {
        int arr[]={3,29,5,11,21,1};
        int incl=0,excl=0;
        for(int num:arr){
               int newExl=Math.min(incl,excl);
               incl=excl+num;
               excl=newExl;
        }
            System.out.println(Math.min(incl,excl));        
    }
}