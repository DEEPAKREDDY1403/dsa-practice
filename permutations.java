public class permutations {
    static void permu(String org,String result)
    {
        if(org.length()==0)
        {
            System.out.println(result);
        }
        for(int index=0;index<org.length();index++)
        {
            char rem=org.charAt(index);
            String substr=org.substring(0, index)+org.substring(index+1);
            permu(substr,result+rem);
        }
    }
        public static void main(String[] args) {
            String value="CHARAN";
            StringBuilder sc=new StringBuilder(value);
            //char a[]=new char[ch.length];
            permu(value,"");
        }
    }