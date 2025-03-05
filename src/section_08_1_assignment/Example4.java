package section_08_1_assignment;
//Round a floating-point number using Math.round(), Math.ceil(), and
//Math.floor().
import java.lang.*;
public class Example4 {
    public static void main(String[] args) {
        double number = 4.9;

        System.out.println("original value is : "+ number);
        // 1. round() - round to nearest number
        System.out.println("rounded value is :"+ Math.round(number));

        // 2. ceil() - round up to the next whole number
        System.out.println("ceil value of the number is : "+ Math.ceil(number));

        // 3. floor() - round to the previous whole number
        System.out.println("floor value of the number is  : "+ Math.floor(number));

    }
}
