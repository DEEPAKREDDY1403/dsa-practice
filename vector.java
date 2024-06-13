import java.util.*;
import java.util.Vector;
public class vector {
    public static void main(String[] args) {
   Vector<Integer> vec=new Vector();
   vec.add(3);
   vec.add(5);
   System.out.println(vec.elementAt(1));
   Vector<Integer> vec2=new Vector();
   vec2.add(14) ; 
   vec2.add(21);
   vec.addAll(2,vec2);
   System.out.println(vec);
   System.out.println(vec.capacity());
   System.out.println(vec.contains(1) ); // returns true or false
   System.out.println(vec.indexOf(21));
   System.out.println(vec.get(0));
   System.out.println(vec.elementAt(2));
   System.out.println(vec.remove(1));
   System.out.println(vec.isEmpty());
   System.out.println(vec.toArray());     
}
}
