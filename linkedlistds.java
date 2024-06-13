import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class linkedlistds {
    public static void main(String[] args) {
        Node head = null;
        Node n1 = new Node(3);
        Node n2 = new Node(5);
        Node n3 = new Node(11);
        head = n1;
        n1.next =  n2;
        n2.next = n3;
        System.out.println(head.next.next.data);
        while(head!=null){
                       System.out.println(head.data+"");
                       head=head.next; 
        }
    }
}
