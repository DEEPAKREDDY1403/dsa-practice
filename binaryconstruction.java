import java.util.*;
class Node{
int data;
Node left,right;
Node(int data)
{
this.data=data;
left=right=null;
}
}

class Btree{
Node root=null;
Node addNode(Node root,int arr[],int index)
{
if(index<arr.length)
{
Node temp=new Node(arr[index]);
root=temp;
root.left=addNode(root.left,arr,(2*index)+1);
root.right=addNode(root.right,arr,(2*index)+2);
}
return root;
}
void Preorder(Node root)
{
if(root!=null)
{
System.out.print(root.data +" ");
Preorder(root.left);
Preorder(root.right);
}
}
}
public class binaryconstruction{
public static void main(String[] args)
{
Btree tree=new Btree();
int[] arr={3,2,5,4,6,71};
Node root=null;

root=tree.addNode(root,arr,0);
tree.Preorder(root);

}
}