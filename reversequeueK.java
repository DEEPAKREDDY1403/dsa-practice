import java.util.*;
import java.util.LinkedList;
import java.util.Stack;
public class reversequeueK {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=1;i<=5;i++){
            queue.add(i);
        }
        int k=3;
        for (int i = 0; i < k; i++) {     // 4,5-que    1,2,3-stack 
            stack.push(queue.remove());
                  }
          while (!stack.empty()) {
            queue.add(stack.pop());        // 4,5,3,2,1-que
          }
          for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.remove());       //       3,2,1,4,5-que
          }
          System.out.println(queue);
        }
}
