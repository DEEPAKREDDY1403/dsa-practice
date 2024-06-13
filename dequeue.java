import java.util.ArrayDeque;

public class dequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> que = new ArrayDeque<Integer>();
        que.add(14);
        que.addFirst(21);
        que.addLast(29);
        que.remove();
        que.removeLast();
        System.out.println(que);
    }
    
}
