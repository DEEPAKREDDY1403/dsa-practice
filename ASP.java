import java.util.*;
public class ASP {
    public static void main(String[] args) {
        int start[]={1,2,4,1,5,8};
        int end[]={3,5,7,8,9,20};
        int countask=1;
        HashMap<Integer,Integer> res = new HashMap<>();
        res.put(start[0],end[0]);
        int startime=start[0];
            int endtime=end[0];
        for(int i=1;i<start.length;i++){
            if(start[i]>endtime){
                endtime=end[i];
                res.put(start[i],end[i]);
                countask++;
            }
        }
        System.out.println(countask);
        System.err.println(res);
    }
}
