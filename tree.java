import java.util.*;

class Node{
    int data;
    Node n1=null,n2=null,n3=null;
    Node(int data){
        this.data=data;
    }
}
class Tree{

    public Node addNode(Node root, int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addNode'");
    }
                       //least 1 child , most 3 child

        
                    }
public class tree{
public static void main(String[] args) {
    Node root = new Node(1);
    root.n1 = new Node(2);
    root.n2 = new Node(3);
    root.n3= new Node(4);
    root.n2.n1 = new Node (5);
    root.n2.n2= new Node(6);
    System.out.println(root.n2.n1.data);
}
}