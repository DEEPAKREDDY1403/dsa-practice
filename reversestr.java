import java.util.*;
public class reversestr{
    public static void main(String args[])
    {
        String str="DEEPAK REDDY";
        char ch[]=str.toCharArray();
        int first=0,last=ch.length-1;
        while(first<last){
            char temp=ch[first];
            ch[first]=ch[last];
            ch[last]=temp;
            first++;
            last--;
        }
        System.out.println(new String(ch));
        }
        }