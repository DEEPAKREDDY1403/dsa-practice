import java.util.*;
public class arrayk{
    public static void main(String[] args) {
        int arr[]={1,2,3,1,2,3};
        int k=2;
        int i=0,j;
        System.out.println(check(arr,k));
    }
    public static boolean check(int arr[],int k){
        int i=0,j=arr.length-1;
        while(i<arr.length){
            if(arr[i]==arr[j]){
            if(j-1<=k){
                return true;
            }
            else{
                return false;
            }
        }
        j--;
        i++;
    }
    return true;
}
}


/*
 * int arr[]={1,0,1,2};
 * boolean flag=false;
 * HashMap<Integer,Integer>hash = new HashMap<>();
 * for(int i=0;i<arr.length;i++){
 * if(hash.contains(arr[i])&& hash.get(arr[i]-i<=k))
 * {
 * flag=true;}
 * else{
 * hash.put(arr[i],i); /54/(key,value)
 * }
 * System.out.println(""+flag);
 * }
 */