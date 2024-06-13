import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
public class removeduplicate{
    public static void main(String[] args) {
        LinkedList<Integer> li=new LinkedList<>();
        li.add(14);
        li.add(21);
        li.add(3);
        li.add(3);
        li.add(4);
        li.add(5);
        li.add(21);
    Set<Integer> s=new HashSet<>();
    while(!li.isEmpty())
    {
        s.add(li.remove());
    }
    System.err.println(s);
}
}