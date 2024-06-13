import java.util.*;
class loading{
    int opp(int a){
return a*a;
}
int opp(int a ,int b){
    return a+b;
}
float opp(float a,float b){
    return a*b;
}
}
public class overidding {
    public static void main(String[] args) {
        loading c=new loading();
        System.out.println(c.opp(3));
        System.out.println(c.opp(14,21));
        System.out.println(c.opp(3.11f,5.11f));
    }
}
