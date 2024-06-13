import java.util.*;
public class stackds {
    public static void main(String[] args) {
        Mystack stack = new Mystack();
        stack.push(14);
        stack.push(21);
        stack.push(03);
        stack.push(29);
        System.out.println(stack.stack);
        stack.pop();
        System.out.println(stack.stack);
        System.out.println(stack.stack.peek());
        System.out.println(stack.stack.size());
    }
    
}
 class Mystack{
    Stack<Integer> stack = new Stack<>();
    void push(int value){
       stack.push(value);
       System.out.println(value +" pushed");
    }
    void pop(){
        System.out.println(stack.pop()+" poped");
    }
 }