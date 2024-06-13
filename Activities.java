public class Activities{
    public static void main(String[] args)
    {
        int s[]={10,22,29};
        int f[]={20,25,30};
        int n=s.length;
        Maxactivities(s,f,n);
}
public static void Maxactivities(int s[],int f[],int n){
        int i, j;
        System.out.println("Following activities are selected");
        i = 0;
        System.out.print(i + " ");
         for (j = 1; j < n; j++) {
            if (s[j] >= f[i]) {
              System.out.print(j + " ");
                i = j;
            }
        }
    }
}