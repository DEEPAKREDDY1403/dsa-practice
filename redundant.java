import java.util.*;
public class redundant {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<Character>();
        String s;
        char[] str = s.toCharArray();
        for (char ch : str) {
             if (ch == ')') {
                char top = stack.peek();
                stack.pop();
                 }   
                
                }
}
