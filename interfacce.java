import java.util.*;
interface A{
   //static final int a=10;
    void display(String name);
}
interface B{
    void display(int age);
}
class C implements A,B{
    public void display(String name){
        System.out.println("Name:"+name);
    }
    public void display(int age){
        System.out.println("Age:"+age);
    }
}
public class interfacce {
    public static void main(String[] args) {
        C obj= new C();
        obj.display("CHARAN");
        obj.display(20);
    }
    
}
