import java.util.*;
class Node{
    int data;
    Node next=null;
    Node(int data){
        this.data=data;
    }
}
class LinkedList{
    Node head=null,tail=null;
    void add(int data){
        Node newnode = new Node(data);
        if(head==null){
            head=newnode;
             tail=head;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
    }
    void display(){
        Node temp = head;
        while(head!=null){
            System.out.println(head.data+" ");
            head=head.next;
        }
        head=temp;
    }
    void removehead(){
        head=head.next;
        display();
        
    }
    void removetail(){
        Node temp,prev=head;
        temp=head;
        while(head.next!=null){
            prev=head;
            head=head.next;
        }
        prev.next=null;
        head=temp;
        display();
    }
}
public class doublelinkedlistds {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(14);
        list.add(21);
        list.add(3);
        list.add(5);
        list.add(11);
        list.display();
        System.out.println("AFTER REMOVING HEAD");
        list.removehead();
        System.out.println("AFTER REMOVING TAIL" );
        list.removetail();
        System.out.println();
    }
}
