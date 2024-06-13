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
    void display(){
        System.out.println("STUDENT DETAILS:");
        System.out.println( this.name+" \n"+this.age+" \n"+this.marks+" \n"+this.per+" \n");
    }
}
public class singleinheritance {
    public static void main(String[] args) {
        B obj = new B("CHARAN",20,97,96);
        obj.display();
        
    }
}
