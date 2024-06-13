import java.util.Stack;

public class stackremove {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> stack1 = new Stack<Integer>();
        int arr[]={10,20,30,40,50};
        int k=30;
        for(int i:arr){
            stack.push(i);
        }
        for(int i:stack){
            if(i!=30){
                stack1.push(i);
            }
        }
        
        System.out.println(stack1);
    }
}
