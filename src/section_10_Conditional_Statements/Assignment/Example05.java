package section_10_Conditional_Statements.Assignment;
import java.util.Scanner;
// Compare three numbers and find maximum of them ?
public class Example05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        double num1 = input.nextDouble();

        System.out.println("Enter the Second number : ");
        double num2 = input.nextDouble();

        System.out.println("Enter the third number : ");
        double num3 = input.nextDouble();
        
        if ((num1 > num2) && (num1 > num3)){
            System.out.println("The maximum number is : "+ num1);
        } else if (num2 > num3) {
            System.out.println("The maximum number is : "+ num2);
        }else {
            System.out.println("The maximum number is : "+ num3);
        }
    }
}
