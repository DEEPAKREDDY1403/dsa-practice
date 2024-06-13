import java.util.Scanner;

public class max{
    public static void main(String[] args) {
            int a,b,c,d,e;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
        int max=a;
        if(b>max)
        {
            max=b;
        }
        else{
            max=(b>max)?b:max;
        }
        if(c>max)
        {
            max=c;
        }
        else
        {
            max=(c>max)?c:max;
        }
        if(d>max)
        {
            max=d;
        }
        else
        {
            max=(d>max)?d:max;
        }
        if(e>max)
        {
            max=e;
        }
        else
        {
            max=(e>max)?e:max;
        }
        System.out.println(max);
    }
}

