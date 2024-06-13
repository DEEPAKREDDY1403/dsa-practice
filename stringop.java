import java.util.*;
public class stringop{
    public static void main(String args[])
    {
    
        char chars[]={'c','d','r','a'};
        String name=new String(chars);
        System.out.println(name);
        char chars2[]=name.toCharArray();
        System.out.println(name.charAt(0));
        String name2="Charan";
        System.out.println(name.equals(name2));
        System.out.println(name.contains("ra"));
        System.out.println(name.indexOf("a"));
        
        }}


