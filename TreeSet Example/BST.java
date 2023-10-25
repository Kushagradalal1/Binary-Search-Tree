import java.util.Iterator;
import java.util.TreeSet;

public class BST {
    public static void main(String[] args) {
        TreeSet<String> s=new TreeSet<>();
        s.add("gfg");
        s.add("course");
        s.add("identity");
        System.out.println(s);
        //Contains
        boolean b=s.contains("identity");
        System.out.println(b);
        //Iterating
        Iterator<String> i=s.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
