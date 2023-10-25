import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        TreeMap<Integer,String> t=new TreeMap<>();
        t.put(10,"gfg");
        t.put(5,"course");
        t.put(15,"identity");
        System.out.println(t);
        //before size
        System.out.println(t.size());
        //remove element :
        t.remove(15);
        System.out.println("After Removing the element : ");
        System.out.println(t);
        //size of
        System.out.println(t.size());

    }
}

