import java.util.Scanner;
class Student{
    String name;
    int age;
    int marks[]=new int[5];
    long roll;
}
public class students {
    public static void main(String args[]){
    /*Student c=new Student();
     // to store mutliple students details we gonna create an array(acessing members of a class(.))
     c.age=20;
     c.name="CHARAN";
     c.roll=1260;
     int arr[]={100,99,98,97,96};
     c.marks=arr;
     System.out.println(c.name +" " + c.age + " " + c.roll +" "+ c.marks[0]);
      */

    Student c[]=new Student[total];
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number of students");
      int total=sc.nextInt();
      for(int i=0;i<total;i++){
        c[i]=new Student();
        System.out.println("enter name,age,roll");
        c[i].name=sc.next();
        c[i].age=sc.nextInt();
        c[i].roll=sc.nextLong();
      }
      for(Student i:c){
        System.out.println("students details are below");
        System.out.println("Name:" +i.name+"Age:" +i.age+"Roll" +i.roll);
        System.out.println("");
        for(int j=0;j<5;j++){
            c[i].marks[j]=sc.nextInt();
            System.out.println(i.marks[j]);
        }
      }
    }
    
}
