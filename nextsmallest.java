public class nextsmallest {
    public static void main(String[] args) {
        int arr[]={5,1,9,2,1,7},lar=-1;
        int arr2[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]>lar)
            {
                lar=arr[i];
                arr2[i]=-1;
            }
            else
            {
                arr2[i]=lar;
                if(i!=0)
                if(arr[i]>arr[i-1])
                    lar=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++)
            System.out.print(arr2[i]+" ");
        System.out.println();
        for(int i=0;i<arr2.length;i++)                                         
        {
            if(!(arr2[i]==-1))
            {
            int j=0,fl=1;
            for(j=0;j<arr.length;j++)
            {
                if(arr[j]==arr2[i])
                    break;
            }
            for(int k=j+1;k<arr.length;k++)
            {
                if(arr[k]<arr[j])
                {
                    arr2[i]=arr[k];
                    fl=0;
                    break;
                }
            }
            if(fl==1)
                arr2[i]=-1;
        }
        }
        for(int i=0;i<arr.length;i++)
            System.out.print(arr2[i]+" ");
        System.out.println();
}
}