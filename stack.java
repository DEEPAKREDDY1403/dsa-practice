import java.util.*;
import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(3);
        stack.push(5);
        stack.push(14);
        stack.push(21);
        stack.peek();
        stack.pop();
        stack.isEmpty();
        stack.capacity();
        System.out.println(stack);
    }
}
