import java.util.*;
public class hash{
    public static void main(String[] args) {
        Hashtable<Integer,String> h=new Hashtable();
        h.put(21,"CHARAN ");
        h.put(14,"DEEPAK");
        System.out.println(h);
        h.get(1);
        h.containsKey(2);
        h.keys();
        h.values();

    }
}