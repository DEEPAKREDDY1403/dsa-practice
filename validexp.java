import java.util.*;
import java.util.Stack;
public class validexp {
public static void main(String[] args) {
    Stack<String> s=new Stack<String>();
    String str="[{[a+b]}]()";
    char[] c=str.toCharArray();
    for(int i=0;i<c.length;i++)
    {
        if(c[i]=='(' || c[i]=='{' || c[i]=='[')
        {
            s.push(Character.toString(c[i]));
        }
        if(c[i]==')' || c[i]=='}' || c[i]==']')
        {
            s.pop();
        }
        //if(c[i]!='(' || c[i]!='{' || c[i]!='[' || c[i]!=')' || c[i]!='}' || c[i]!=']')
        else
        {
            s.push(Character.toString(c[i]));
            s.pop();
        }
    }
    if(s.isEmpty())
    {
        System.err.println("VALID EXPRESSION");
    }
    else{
        System.err.println("INVALID EXPRESSION");
    }
    }
    
}