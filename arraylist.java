import java.util.ArrayList;
import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        List<Integer> li =new ArrayList();
        ArrayList<Integer> ali= new ArrayList();
        li.add(3);
        li.add(5);
        ali.add(14);
        ali.add(21);
        ali.addAll(0,li);
        System.err.println(ali);
        ali.get(0);
        }
}
