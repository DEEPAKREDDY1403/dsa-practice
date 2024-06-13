import java.util.*;
public class splitnjoin{
        public static void main(String args[]){
        int  c[]={14,21,03,11,29},pos=2;
        reverse(0,pos,c);
        reverse(pos+1,c.length-1,c);
        reverse(0,c.length-1,c);
        for(int i:c){
            System.out.println(i+"");
        }
          }
          private static void reverse(int start,int end,int c[]){
            while(start<end){ 
              int temp=c[start];
                c[start]=c[end];
                c[end]=temp;

            }
          }
}