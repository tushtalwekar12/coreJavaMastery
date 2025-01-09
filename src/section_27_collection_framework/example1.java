package section_27_collection_framework;
import java.util.*;

public class example1 {
    public static void main(String [] args){
        ArrayList<Integer> arrayList1 = new ArrayList<>(20);
        arrayList1.add(10);

        arrayList1.add(0,5);
        arrayList1.add(0,70);


        ArrayList<Integer> arrayList2 = new ArrayList<>(List.of(50,60,70,80,90));
        System.out.println("Array List 1 After Adding Array List 2 :"+ arrayList1);

        ArrayList<Integer> arrayList3 = new ArrayList<>();

        arrayList3.add(100);
        arrayList3.add(200);
        arrayList3.add(300);
        System.out.println("Array List 3 :"+ arrayList3);

        arrayList1.addAll(3 , arrayList3);
        System.out.println("Array List 1 After Adding List 3 At Index 3 :");

        boolean result = arrayList1.contains(50);
        System.out.println("Array List-1 Contain 50 :" + result);

        System.out.println("Element present at 6th index in Array List-1 :"+ arrayList1.get(6));

        System.out.println("Index of 200 In Array List is : "+ arrayList1.indexOf(200));

        System.out.println("Index of 70 In Array List-1 : "+ arrayList1.indexOf(70));
        System.out.println("Last Index of 70 In Array List-1 : "+ arrayList1.lastIndexOf(70));

        arrayList1.set(6,-99);
        System.out.println("Set -99 at index 6 in array List-1 :"+ arrayList1);

        result = arrayList1.containsAll(arrayList2);
        System.out.println("ArrayList1 Contains All Element of ArrayList2 :" +result);

        ArrayList<Integer> nums1 = new ArrayList<Integer>(List.of(12,13,14,15,16));
        ArrayList<Integer> nums2 = new ArrayList<Integer>(List.of(12,14,15));

        nums2.removeAll(nums1);
        System.out.println("Remove All :"+ nums2);

        System.out.println("Iterating All element in array List-1 :");
        for(int i=0; i<arrayList1.size(); i++){
            System.out.println(arrayList1.get(i));
        }

    }

}
