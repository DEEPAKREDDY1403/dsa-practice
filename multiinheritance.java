import java.util.*;
class A{
    String name;
    int age;
    A(String name,int age){
        this.name=name;
        this.age=age;
    }
}
class B extends A{
    int marks;
    float per;
    B(String name,int age,int marks,float per){
        super(name,age);
        this.marks=marks;
        this.per=per;
    }
}
class C extends B{
     String sports;
    C(String name, int age, int marks, float per,String sports) {
        super(name, age, marks, per);
        this.sports=sports;
    }

    void display(){
        System.out.println("STUDENT DETAILS:");
        System.out.println( this.name+" \n"+this.age+" \n"+this.marks+" \n"+this.per+" \n"+this.sports+"");
    }
}
public class multiinheritance {
    public static void main(String[] args) {
        C obj = new C("CHARAN",20,97,96,"BASKET BALL");
        obj.display();
        
    }
}
