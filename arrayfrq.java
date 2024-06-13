import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class arrayfrq {
    public static void main(String[] args) {
        int arr[]={3,5,11,14,21,29,3,5,21,21};
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i:arr){
            ar.add(i);
        }
        HashMap<Integer,Integer> h= new HashMap();
        for(int i=0;i<ar.size();i++){
            h.putIfAbsent(ar.get(i),Collections.frequency(ar, ar.get(i)));
        }
        System.out.println(h);
    }
    
}
