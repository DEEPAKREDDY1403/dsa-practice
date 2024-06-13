import java.util.*;
public class nextgreatest{
    public static void main(String args[]){
        int arr[]={5,1,9,2,1,7}; 
        int great[]=findgreatest(arr);
        for(int i: great){
            System.out.println(i+"");
        }
    }
    public static int[] findgreatest(int[] arr){
        Stack<Integer> stack = new Stack<Integer>();
        int res[]=new int [arr.length];
          for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            
          }
          res[i]=stack.isEmpty()?-1:stack.peek();
          stack.push(arr[i]);
    }
    return res;
}}