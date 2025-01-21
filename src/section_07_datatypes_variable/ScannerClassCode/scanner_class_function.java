package section_07_datatypes_variable.ScannerClassCode;
// date : 15-01-2025 - Scanner Class function
import java.util.*;
public class scanner_class_function {
    public static void main(String[] args){
        // create an object of Scanner class
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name ");
        System.out.println("Your Name is :"+ sc.next());
        sc.nextLine();

        System.out.println("Enter Your Address:");
        System.out.println("Your Address:"+sc.nextLine());

        System.out.println("Enter your Percentag:");
        System.out.println("your Percentag:"+sc.nextByte());

        System.out.println("Enter Your age :");
        System.out.println("Your age :"+sc.nextInt());

        System.out.println("Enter Your CGPA :");
        System.out.println("Your CGPA :"+sc.nextFloat());

        System.out.println("Eneter Your Salary :");
        System.out.println("Your Salary :"+sc.nextDouble());

        System.out.println("Are You Marraried :(true/false)");
        System.out.println("Marraried Status :"+sc.nextBoolean());

        System.out.println("tell India population :");
        System.out.print("India population :"+sc.nextLong());

        /*next() : nextline() method is used to read multiple words from keyword
        * next() : method is used to read single word from keyboard.
        *  */
    }
}
