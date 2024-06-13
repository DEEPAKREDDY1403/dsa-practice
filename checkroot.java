import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Treee{
            Node addNode(Node root,int value){
                if(root==null){
                    return new Node(value);
                }
                     if(value<root.data){
                        root.left=addNode(root.left,value);
                     }
                     else if(value<root.data){
                        root.right=addNode(root.right,value);
                     }
                     else{
                        return root;
                     }
                     return root;
            }
 void contains(Node root,int key){
    if(root!=null){
    if(root.data==key){
        System.out.println("KET FOUND");
    }
    contains(root.left, key);
    contains(root.right, key);
 }
}
}
public class checkroot{
            public static void main(String[] args) {
                Treee c = new Treee();
                Node root = new Node(21);
                c.addNode(root,14);
                c.addNode(root,3);
                c.addNode(root,5);
                c.contains(root,21);
            }
  
}
