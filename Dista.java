public class Dista {
    static void getFare(String src,String des){
        int s=getIndex(src)-1;
        int dist[]={800,600,750,900,1200,1100,1500};
        int d=getIndex(des)==0?dist.length-1:getIndex(des)-1;
        System.err.println(s+" "+d);
        int st=0;
        for(int i=s;!(i==d+1);i++){
            if(i==dist.length)
                i=0;
            st+=dist[i];
            System.out.println(dist[i]);
            
        }
        System.out.println(st);
        int cost =5;
        float fare=0;
        fare =(float)Math.ceil((st/1000.0)*cost);
        System.out.println(fare);
    }
    static void newgetFare(String src,String des){
        int s=getIndex(src)-1;
        int dist[]={800,600,750,900,1200,1100,1500};
        int d=getIndex(des)==0?dist.length-1:getIndex(des)-1;
        int dis =0;
        if(s<d)
            for(int i=s;i<d;i++)
                dis+=dist[i];
        else{
            // for(int i=s;i<dist.length;i++)
            //     dis+=dist[i];
            // for(int i=0;i<d+1;i++)
            //     dis+=dist[i];
            int i=0,j=dist.length-1;
            while(i<j){
                if(i<=d)
                    dis+=dist[i];
                    i++;
                if(j>=s)
                    dis+=dist[j];
                j--;
            }
        }
        int cost =5;
        float fare=0;
        fare =(float)Math.ceil((dis/1000.0)*cost);
        System.out.println(fare);
    }
    static int getIndex(String s){
        String bs[]={"TH","GA","IC","HA","TE","LU","NI","CA"};
        for(int i=0;i<bs.length;i++){
            if(bs[i]==s)
                return i;
        }
        return -1;
        
    }
    public static void main(String[] args) {
        newgetFare("NI", "HA");
        System.out.println(getIndex("TH"));
    }
}