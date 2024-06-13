import java.util.*;
import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        Set<String> hs =new HashSet<String>();
        hs.add("C");
        hs.add("D");
        hs.add("C");
        hs.add("R");
        hs.add("A");
        hs.add("S");  
        hs.add("D");
        System.err.println(hs);
        hs.remove("D"); //cant give direct index value cz unordered collection of data
       hs.size();
       Iterator<String> itr = hs.iterator();
       while(itr.hasNext()){
        System.err.println(itr.next());
       }
    }
}
