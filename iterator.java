import java.util.*;
import java.util.Stack;
public class iterator{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(3);
        stack.push(5);
        stack.push(14);
        stack.push(21);
        stack.size();
        Iterator<Integer> itr = stack.iterator();
        while(itr.hasNext()){
            System.err.println(itr.next());
        }
    }
}
