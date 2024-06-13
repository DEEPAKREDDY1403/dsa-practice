import java.util.*;
public class pattern 
{              
public static void main(String[] args)   
{  
for (int i = 1; i <= 8; i++)  
{  
int n = 8;  // n means number of rows
for (int j = 0; j<= n - i; j++)   
{   
System.out.print("  ");  
}   
for (int k = i; k >= 1; k--)  
{  
System.out.print(k+" "); 

}  
for (int l = 2; l <= i; l++)   
{  
System.out.print(l+" ");   
}   
System.out.println( );   
}   
}  
}  