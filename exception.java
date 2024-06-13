public class exception {
    public static void main(String[] args) {
        String s="10,5";
        String f="11.5,5.6";
        String arr[]  = s.split(",");
        try{
            int a,b;
            a=Integer.parseInt(arr[0]);
            b=Integer.parseInt(arr[1]);
            System.out.println(a+b);
        }
        catch(Exception e)
        {
            try{
            float c=Float.parseFloat(arr[0]);
            float b=Float.parseFloat(arr[1]);
            System.out.println(c+b);
            }
            catch(Exception e1)
            {
                System.out.println(e1);
            }
        }
    }
}