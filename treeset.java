import java.util.*;
public class treeset {
    public static void main(String[] args) {
        Set<String> ts =new TreeSet<String>();
        ts.add("C");
        ts.add("D");
        ts.add("C");
        ts.add("R");
        ts.add("A");
        ts.add("S");  
        ts.add("D");
        System.err.println(ts);
        ts.remove("D"); //cant give direct index value cz unordered collection of data
       ts.size();
       Iterator<String> itr = ts.iterator();
       while(itr.hasNext()){
        System.err.println(itr.next());
       }
    }
    
}
