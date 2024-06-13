import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class reversequeue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        Stack<Integer> stack=new Stack<>();
        for(int i=1;i<=5;i++){
            queue.add(i);
        }
        while(!queue.isEmpty()){
            stack.push(queue.poll());
        }
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
                 System.out.println(queue);
    }
    
}
