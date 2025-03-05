package section_10_Conditional_Statements.Assignment;
import java.util.Scanner;
// Write a program to check whether number is positive or negative
public class Example04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number : ");
        double number = input.nextDouble();

        if (number > 0){
            System.out.println(number + "this is positive number.");
        } else if (number == 0) {
            System.out.println(number + "this is Zero.");
        }else {
            System.out.println(number + "this is Negative number.");
        }
    }
}
