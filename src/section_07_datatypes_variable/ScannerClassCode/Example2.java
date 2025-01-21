package section_07_datatypes_variable.ScannerClassCode;
//calculates the area of a rectangle based on user input for the length and width.
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        // create object
        Scanner sc =new Scanner(System.in);

        // input length
        System.out.println("Enter the length of reactangle");
        double length =sc.nextDouble();

        //input width
        System.out.println("Enter the width of reactangle");
        double width =sc.nextDouble();

        // calculated area
        double area_calculated = length * width;

        // print area
        System.out.println("area of rectangle : "+ area_calculated);

        //close the scanner class
        sc.close();
    }
}
