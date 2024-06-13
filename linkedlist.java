import java.util.*;
import java.util.LinkedList;
public class linkedlist {
      public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(3);
        ll.add(0,1);
        ll.addFirst(29);
        ll.addLast(21);
        ll.remove();
        ll.remove(0);
        ll.removeFirst();
        ll.removeLast();
        ll.getFirst();
        ll.getLast();
        ll.get(0);
        ll.size();
        ll.contains(21);
      }
}
