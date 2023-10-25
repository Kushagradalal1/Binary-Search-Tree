
import java.util.TreeMap;

public class Demo {
    public static void main(String[] args) {
        TreeMap<Integer,String> t=new TreeMap<Integer, String>();
        t.put(10,"gfg");
        t.put(5,"course");
        t.put(15,"identity");
        System.out.println(t.higherKey(10));
        System.out.println(t.lowerKey(10));
        System.out.println(t.floorKey(10));
        System.out.println(t.ceilingKey(10));
        //get values :
        System.out.println(t.higherEntry(10).getValue());
        System.out.println(t.lowerEntry(10).getValue());
        System.out.println(t.floorEntry(10).getValue());
        System.out.println(t.ceilingEntry(10).getValue());
    }
}
