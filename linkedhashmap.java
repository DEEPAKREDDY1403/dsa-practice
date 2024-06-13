import java.util.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class linkedhashmap {
    public static void main(String[] args) {
        Map<String,Integer> map= new LinkedHashMap<String,Integer>();
        map.put("D",14);
        map.put("C",21);
        map.get("C");
        map.containsKey("D");
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.err.println(e.getKey()+" "+e.getValue());
        }
    }
    
}
