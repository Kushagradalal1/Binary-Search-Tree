port java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        TreeSet<Integer> i=new TreeSet<>();
        i.add(10);
        i.add(5);
        i.add(2);
        i.add(15);

        System.out.println(i.lower(5));
        System.out.println(i.higher(5));
        System.out.println(i.floor(5));//<=
        System.out.println(i.ceiling(5));//>=
        //null case
        System.out.println(i.lower(2));
    }
}
