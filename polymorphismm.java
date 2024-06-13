import java.util.*;
class math{
    int opp(int a){
        return a*a;
    }
}
class mymath extends math{
    int opp(int a){
        return a*a*a;
    }
}
public class polymorphismm {
    public static void main(String[] args) {
        math c=new math();
        System.out.println(c.opp(3));

    }
}
