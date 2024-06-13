import java.util.Vector;
class coinchange
{	public static void main(String[] args) 
	{
     int arr[] = {1, 2, 5, 10, 20,50, 100, 500, 1000};

		int target = 1421;
		int countdenominations=0;
        int index=arr.length-1;
        while(index>0){
            if(arr[index]<=target){
                         target-=arr[index];
                         countdenominations++;
                         System.out.print(arr[index]+" ");
            }
            else{
                index--;
            }
        }
        System.err.println();
        System.out.println("TOTAL COINS REQUIRED ARE : "+countdenominations);
	}
}