
import java.util.*;
import java.util.Hashtable;
public class frequency {
    public static void main(String[] args) {
        Hashtable<Character,Integer> h=new Hashtable();
        String str="abcccddddd";
        for(char c : str.toCharArray()){
               if(!h.containsKey(c)){
                h.put(c,1);
               }
               else{
                int x=h.get(c);
                h.put(c,x+1);
               }
        }
        System.out.println(h);
    }
    
}
