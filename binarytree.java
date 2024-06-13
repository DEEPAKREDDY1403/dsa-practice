import java.util.*;
import java.util.TreeMap;
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
                     else{
                        return root;
                     }
                     return root;
            }
}
public class binarytree {
            public static void main(String[] args) {
                Treee c = new Treee();
                Node root = new Node(21);
                c.addNode(root, 14);
                c.addNode(root,29);
                System.out.println(root.left.left.data);
               System.out.println(root.right.right.data);

            }
  
}
