package section_27_collection_framework;
// date :20-01-2025
import java.util.ArrayList;
import java.util.*;

public class Example2 {
    public static void main(String [] args){
        Collection<String> c1 = new ArrayList<>(List.of("A","B","C","D","E","F"));
        Collection<String> c2 = new ArrayList<>(List.of("E","F","G","H"));

        c1.add("X");
        c2.addAll(c2);
        c1.remove("G");
        // c1.removeAll(c2);
        c1.retainAll(c2);
        boolean result;
        result =c1.contains("Y");
        result =c1.containsAll(c2);
        int len = c1.size();
        System.out.print("LOgger");
    }
}
