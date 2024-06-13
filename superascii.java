import java.util.Scanner;
public class superascii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(superasci(str));
    }
    private static String superasci(String str){
        int arr[]=new int[26];
        for(char c : str.toCharArray()){
        int foundindex=c-'a';
        arr[foundindex]+=1;
        }
        for(int i=0;i<26;i++){
           if(arr[i]!=0 && arr[i]!=i+1){
            return "NOT SUPER ASCII";
           }
        }
        return "SUPER ASCII";
}
}
