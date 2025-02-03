package section_27_collection_framework.linked_Hash_Map;
// LinkedHashMap
import java.util.LinkedHashMap;
public class Example1 {
    public static void main(String[] args) {
        // Linked Hash Map
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>(10, 0.5f);
        linkedHashMap.put(12, "A");
        linkedHashMap.put(17, "B");
        linkedHashMap.put(14, "C");
        linkedHashMap.put(24, "D");

        System.out.println(linkedHashMap);

        linkedHashMap.put(26, "D");
        linkedHashMap.put(27, "D");
        linkedHashMap.put(28, "D");
        linkedHashMap.put(29, "D");
        linkedHashMap.put(30,"D");
        linkedHashMap.put(31,"D");
        linkedHashMap.put(32,"D");

        System.out.println(linkedHashMap);
    }
}
