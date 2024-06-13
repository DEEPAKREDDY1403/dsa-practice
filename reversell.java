import java.util.*;
import java.util.LinkedList;
public class reversell { 
      public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        ll.add(14);
        ll.add(21);
        ll.add(3);
        ll.add(11);
        ll.add(5);
        System.out.println("BEFORE REVERSING:"+ll);
        while(!ll.isEmpty()){
            stack.push(ll.remove());
        }
        while(!stack.isEmpty()){
            ll.add(stack.pop());
        }
                 System.out.println("AFTER REVERSING:"+ll);
      }
}

