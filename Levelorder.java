import java.util.*;
import java.util.ArrayDeque;

class Node
{
    int data;
    Node left,right=null;
    Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}
class tree
{
    Node insert(Node root,int value)
    {
        if(root==null)
            return new Node(value);
        if(value<root.data )
        {
           root.left=insert(root.left, value);
        }
        else if(value>root.data)
        {
           root.right=insert(root.right,value);
        }
        return root;
}
boolean contains(Node root,int value)
{
    Node temp=root;
    if(temp==null)
        return false;
    while(temp!=null)
    {
        if(temp.data==value)
            return true;
        if(temp.data>value)
            temp=temp.left;
        else if(temp.data<value)
            temp=temp.right;
    }
    return false;
}
void levelorder(Node root)
{
    ArrayDeque<Node> qu=new ArrayDeque<>();
    qu.add(root);
    while(!qu.isEmpty())
    {
        Node temp=qu.removeFirst();
        System.out.print(temp.data+" ");
        if(temp.left!=null)
            qu.addLast(temp.left);
        if(temp.right!=null)
            qu.addLast(temp.right);
    }
}
}
public class Levelorder {
    public static void main(String[] args) {
        tree t=new tree();
        Node root=null;
        root=t.insert(root,3);
        root=t.insert(root,2);
        root=t.insert(root,5);
        root=t.insert(root,4);
        root=t.insert(root,1);
        root=t.insert(root,6);
        t.levelorder(root);
        System.out.println();
    }  
}
