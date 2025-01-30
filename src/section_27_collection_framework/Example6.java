package section_27_collection_framework;
import java.util.TreeSet;
// tree set
public class Example6 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet1 = new TreeSet<>();

        // add() function
        treeSet1.add(10);
        treeSet1.add(30);
        treeSet1.add(50);
        treeSet1.add(70);
        treeSet1.add(10);
        treeSet1.add(40);

        // ceil function
        System.out.println(treeSet1);
        int ceil = treeSet1.ceiling(35);

        System.out.println("Ceil For 35 :" + ceil);
        ceil = treeSet1.ceiling(50);
        System.out.println("Ceil For 50 : " + ceil);
        ceil = treeSet1.ceiling(55);
        System.out.println("Ceil For 55 : " + ceil);

        // floor function
        int floor = treeSet1.floor(50);
        System.out.println("Floor For 50 : " + floor);
        floor = treeSet1.floor(55);
        System.out.println("Floor For 55 " + floor);

        boolean isPresent = treeSet1.contains(70);
        System.out.println("70 is present in tree : " + isPresent);
    }
}
