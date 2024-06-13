import java.util.*;
public class quicksort{
    public static void main(String[] args) {
        int arr[]={29,14,1,21,5,3,11};
        Quicksort(arr,0,arr.length-1);
        // Arrays.sort(arr); inbuilt arrays class sorting
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    private static void Quicksort(int[] arr,int left,int right){
        if(left<right){
            int pivotIndex=partition(arr,left,right);
            Quicksort(arr, left, pivotIndex-1);   // left
            Quicksort(arr,pivotIndex+1,right); // right partition
        }
    }
    private static int partition(int[] arr, int left, int right) {
             int pivot = arr[right];
             int i=(left-1);
             for(int j=left;j<right;j++){
                // compare ar[j] with pivot
            if(arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }    
             }
             // pos of pivot back to its place
             int temp =arr[i+1];
             arr[i+1]=arr[right];
             arr[right]=temp;
             return i+1; // return next pivot index
    }
}