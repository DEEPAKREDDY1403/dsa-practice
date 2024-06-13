import java.util.*;
public class queue {
 public static void main(String[] args) {
    Queue<Integer> que = new PriorityQueue<Integer>();
    que.add(29);
    que.add(14);
    que.add(21);
    que.add(3);
    que.add(5);
    que.add(11);
    que.remove(); // removes from fornt
    que.poll(); // removes from first as remove();
    System.out.println(que);
 }    
}
