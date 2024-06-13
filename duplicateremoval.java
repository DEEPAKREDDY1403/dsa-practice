import java.util.*;
public class duplicateremoval {
    public static void main(String[] args) {
    Stack<Character> stack = new Stack<Character>();
    String str = "abbacaad";
    for(char c: str.toCharArray()){
        if(!stack.isEmpty() && (stack.peek()==c)){
            stack.pop();
        }
        else{
            stack.push(c);
        }
    }
    StringBuilder sb = new StringBuilder();
    for(char c:stack){
        sb.append(c);
    }
    System.out.println(sb.toString());
}
}
    