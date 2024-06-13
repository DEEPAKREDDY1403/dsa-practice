public class arraysort{
    public static boolean findSort(int arr[],int n){
        if(arr.length-1==n)
        return true;
        else
        return(arr[n]<arr[n+1]?true:false) && findSort(arr,n+1);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        int arr1[]={2,5,8,4,7};
        System.out.println(findSort(arr,1));
        System.out.println(findSort(arr1,1));

    }
}