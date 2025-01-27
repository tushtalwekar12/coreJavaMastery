package section_27_1_assignment;
// Assignment - ArrayList - Question 1: ArrayList Operations and Modifications
import java.util.ArrayList;
import java.util.List;

//Practice performing various operations on ArrayList and modifying the list elements.
public class Example1 {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<Double>(5);
        arrayList.add(10.2);
        // add another element
        arrayList.add(11.3);
        arrayList.add(12.4);
        arrayList.add(13.5);

        // add 5.44 at index 2
        arrayList.add(2,5.44);


        // creating another arraylist of double type
        ArrayList<Double> arrayList1 = new ArrayList<>(List.of(20.8,50.7,60.6));


        // add arraylist1 to arraylist at the end of the list


    }
}
