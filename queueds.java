class queue{
    int size=5,front=-1,rear=-1;
        int que[]=new int[size];
    int poll(){
        if(front==size-1){
            front=-1;
            rear=-1;
            }
        if(front==-1 && rear==-1){
            return -1;
        }
           int res=que[++front];
        que[front]=0;
        return res;
    }
    void add(int value){
        if(rear<size){
            que[++rear]=value;
        }
              if(rear!=size-1){
                que[rear++]=value;
              }
              return;
    }
    void display(){ 
    for(int i:que)
    System.out.println(i+"");
    }
}
public class queueds {
           public static void main(String[] args) {
            queue q =new queue();
            
            int arr[]={1,3,6,7,9};
            for(int i:arr){
                q.add(i);
                q.display();
            }
           }
}
