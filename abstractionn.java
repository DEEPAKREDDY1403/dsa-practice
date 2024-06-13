abstract class example{
    abstract void display();
    void run(){
        System.out.println("RUN");
    }
}
class A extends example{
  void display(){                                // if u keep run method here it will not executed bz of abstraction method(run information hided)
    System.out.println("ABSTRACT METHOD");
  }
}
public class abstractionn {
    public static void main(String[] args) {
        example c=new A();
        c.display();
    }
}
