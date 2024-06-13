class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class tree{
    static Node addNode(Node root,int arr[],int i){
        if(i<arr.length){
        Node temp = new Node(arr[i]);
        root = temp;
        root.left=addNode(root.left,arr,(2*i)+1);
        root.right=addNode(root.right,arr,(2*i)+2);
        }
 return root;
    }
    public static boolean findBST(Node root,int min,int max){
        if(root==null) 
        {
        return true;
         }
         if(root.data<=min || root.data>=max){
         return false;
         }
            return findBST(root.left,min,root.data) && findBST(root.right,root.data,max);
    }
}
public class BST {
     public static void main(String[] args) {
        int arr[]={30,20,40,10,25,35,50};
        tree c = new tree();
        Node root = null;
        root = tree.addNode(root,arr,0);
        System.out.println(c.findBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
     }
}
