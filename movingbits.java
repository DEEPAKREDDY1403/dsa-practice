import java.util.*;
public class movingbits {
    public static void main(String[] args) {
        String a="101001001001";
        char ch[]=a.toCharArray();
        int first=0,end=ch.length-1;
        while(first<end)
        {
            if(ch[first]=='0')
            {
                if(ch[end]=='1')
                {
                    char temp=ch[first]
                    ch[first]=ch[end];
                    ch[end]=temp;
                }
                end--;
            }
            else{
            first++;
            }
        }
        System.out.println(new String(ch));
    
    }
    
}