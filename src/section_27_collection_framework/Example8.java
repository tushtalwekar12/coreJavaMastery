package section_27_collection_framework;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Example8 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1,"Pranay Ramteke");
        treeMap.put(2,"Rekha Bachchan");
        treeMap.put(3,"Aishwarya Oberoi");
        treeMap.put(4,"Katrina Khan");
        treeMap.put(5,"Disha Shorff");
        treeMap.put(6,"Giorgia Modi");

        System.out.println(treeMap);

        Boolean isPresent = treeMap.containsKey(3);
        System.out.println("key 3 is present : " + isPresent);

        String value = treeMap.get(3);
        System.out.println("value for key 3 : " + value);

        Entry<Integer, String> entry = treeMap.firstEntry();
        System.out.println("Record : "+ entry.getKey() + "..." + entry.getValue());

        entry = treeMap.lastEntry();
        System.out.println("Last Records : "+ entry.getKey() + ".." + entry.getValue());
    }
}
