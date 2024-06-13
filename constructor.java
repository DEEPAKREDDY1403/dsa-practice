import java.util.*;
class Student{
    String name;
    Student(String name){
        this.name=name;
    }
    public void display(){
        System.out.println("Student name is :"+name);
    }
}

public class constructor {
    public static void main(String args[]){
        Student obj=new Student("CHARAN");
        obj.display();
    }    
}
;