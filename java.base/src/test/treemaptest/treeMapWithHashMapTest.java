package treemaptest;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class treeMapWithHashMapTest {
    public static void main(String[] args) {
        
        HashMap<Integer , String> hm = new HashMap<>() ;
        hm.put(1, "kirk");
        hm.put(2, "zhang");


        TreeMap<Integer , String> tm = new TreeMap<>(hm);
        for(Map.Entry<Integer, String> entry : tm.entrySet()){
                System.err.println(entry.getKey() + " : " + entry.getValue());
        }
        
    }
}
