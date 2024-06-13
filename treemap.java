import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class treemap {
   public static void main(String[] args) {
     Map<String,Integer> map = new TreeMap<String,Integer>();
        map.put("DEEPAK",14);
        map.put("CHARAN",21);
        map.get("CHARAN");
        map.containsKey("D");
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.err.println(e.getKey()+" "+e.getValue());
   }    
}
}
