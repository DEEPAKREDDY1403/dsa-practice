import java.util.Stack;

public class stackrev {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> stack1 = new Stack<Integer>();
        int arr[]={10,20,30,40,50};
        for(int i:arr){
            stack.push(i);
        }
        while(!stack.isEmpty()){
            stack1.push(stack.pop());
        }
        System.out.println(stack1);
    }
    
}
