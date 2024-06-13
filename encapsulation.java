import java.util.*;
class Account{
    public static String username;
    private static String password;
    void setpass(String pass){
        this.password=pass;     
    }
 String getpass(){
    return this.password;
 }
}
public class encapsulation extends Account{
    public static void main(String[] args) {
       Account c=new Account();
       c.setpass("2129");
       System.out.println(c.getpass());
    }
}
