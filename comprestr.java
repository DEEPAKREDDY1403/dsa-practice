public class comprestr {
    public static void main(String[] args) {
        String str="440035066081";
        StringBuilder s = new StringBuilder(str);

        for(int i=0;i<s.length()-2;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                int x = Integer.parseInt(String.valueOf(s.charAt(i)));
                    x*=2;
                    s.replace(i, i+String.valueOf(x).length() , String.valueOf(x));
                    if(String.valueOf(x).length()==1)
                    s.delete(i+1, i+2);
            }
        }
        System.out.println(s);
    }
}