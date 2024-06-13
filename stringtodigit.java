import java.util.*; 
public class stringtodigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().split("")[1];
        int res=0;
          for(char c: str.toCharArray()){
            res=res*10+(c-48);                    // converting integer manually
          }
          System.out.println(res);
        }
    }