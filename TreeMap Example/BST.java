import java.util.Map;
import java.util.TreeMap;

public class BST {
    public static void main(String[] args) {
        TreeMap<Integer, String> t=new TreeMap<>();
        t.put(10,"gfg");
        t.put(5,"course");
        t.put(15,"identity");

        System.out.println(t);
        //Contains function
        System.out.println(t.containsKey(10));

        //Iterator..
        for (Map.Entry<Integer,String> e : t.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
