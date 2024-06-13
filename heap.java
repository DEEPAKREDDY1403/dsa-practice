class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Heap{
    Node addNode(Node root, int arr[],int i){
        Node temp = new Node(arr[i]);
        root=temp;
        root.left=addNode(root.left,arr,(2*i)+1);
        root.right=addNode(root.right,arr,(2*i)+2);

    }
}
void hepify(int arr[],int index){
    while(index<arr.length){
        int leftIndex=(2*index)+1;
        int rightIndex=(2*index)+2;
        if(arr[index]<arr[leftIndex])
        {
            int temp=arr[index];
            arr[index]=arr[leftIndex];
            arr[leftIndex]=temp;
        }
        if(arr[index]<arr[rightIndex]){
            int temp=arr[index];
            arr[index]=arr[leftIndex];
            arr[leftIndex]=temp;
        }
        Hepify(arr,);
        Hepify(arr,);
    }
}
public static void main(String[] args) {
    
}
