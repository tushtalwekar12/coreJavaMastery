package section_21_Exception_Handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

// date : 11-02-25
public class Example1 {
    public static void main(String[] args) {
        // division by zero error
//        int  a = 10 ;
//        int b = 0;
//        int result;
//
//        try {
//            result = a / b;
//            System.out.println("Result : "+ result);
//        } catch (Exception e){
//            System.out.println("division by zero error");
//        }

        int [] nums ={1,2,3,4,5,6,7,8,9};
        String data = null;

        try{
            System.out.println(nums[6]);
            data.getBytes();
            FileReader reader = new FileReader("data.txt");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Error");
        }catch (FileNotFoundException e){
            System.out.println("File Error ");
        }catch (NullPointerException e){
            System.out.println("Attach Object Dikra");
        }
    }
}
