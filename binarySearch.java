import java.util.*;

import javax.management.BadStringOperationException;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
    }
}
class tree{
    static Node addNode(Node root,int value){
        if(root==null){
            return new Node(value);
        }if(value<root.data){
            root.left=addNode(root.left,value);
         }
         else if(value>root.data){
            root.right=addNode(root.right,value);
         }
         return root;
}
static Boolean BST(Node root,int key) {
    if(root==null){
        return false;
    }
    if(root.data==key){
        return true;
    }
    if(key<root.data){
       return BST(root.left,key);
    }
    else{
       return BST(root.right,key);
    }}
}
public class binarySearch {
       public static void main(String[] args) {
        tree c = new tree();
        
        Node root=null;
                int arr[]={3,2,5,1,4,7};
                for(int i:arr){
                    root=tree.addNode(root,i);
                }
                System.out.println(tree.BST(root,4));
       }   
}
