
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<Integer> i=new TreeSet<>();
        i.add(10);
        i.add(5);
        i.add(2);
        i.add(15);
        System.out.println(i);
        i.remove(5);
        System.out.println("Removing '5' : ");
        for (int v : i){
            System.out.println(v);
        }
    }
}