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
                     else if(value>root.data){
                        root.right=addNode(root.right,value);
                     }
                     return root;
            }
 

void preOrder(Node root){
    if(root!=null){
        System.out.println(root.data+"");
        preOrder(root.left);
        preOrder(root.right);
    }
}
}
public class preorder{
            public static void main(String[] args) {
                Treee c = new Treee();
                Node root = new Node(21);
                c.addNode(root,14);
                c.addNode(root,29);
                c.preOrder(root);   // ROOT LEFT RIGHT 
            }
  
}
