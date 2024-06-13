import java.util.*;
public class mergesort{
    public static void main(String[] args) {
     int arr[]={29,03,14,11,21,05};
     mergeSort(arr,0,arr.length-1);
     for(int i:arr){
        System.out.print(i+" ");
     }
    }
    private static void mergeSort(int[] arr,int left,int right){ // merge method here used to divide array (into left and right)
        if(left<right){
            int mid = (left + right)/2; // or right+(right-left)
             mergeSort(arr, left, mid);
             mergeSort(arr, mid+1, right);
             merge(arr,left,mid,right);
        }
    }
    private static void merge(int[] arr,int left,int mid,int right){
                    int leftLength = mid-left+1;
                    int rightLength= right-mid;
                    int leftarray[]=new int[leftLength];
                    int rightarray[]= new int[rightLength];
                    // copy
                    System.arraycopy(arr,left,leftarray,0,leftLength);
                    System.arraycopy(arr,mid+1,rightarray,0,rightLength);
                    // compare merge
                    int i=0,j=0;
                    int k=left;   // merged subarray index initial
                    while(i<leftLength && j<rightLength){
                        if(leftarray[i]<=rightarray[j]){
                             arr[k]=leftarray[i];
                             i++;
                        }
                        else{
                            arr[k]=rightarray[j];
                            j++;
                        }
                        k++;
                    }
// copy remaning elements from leftarray[]
while(i<leftLength){
    arr[k++]=leftarray[i++];
}while(j<rightLength){
    arr[k++]=rightarray[j++];
}
    }

}