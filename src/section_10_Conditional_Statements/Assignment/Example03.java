package section_10_Conditional_Statements.Assignment;
import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        /* Example-2
        Calculator:
          Create a simple calculator using a switch statement. Take two numbers and an operator (+, -, *, /, %),
           and perform the operation based on the operator.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the  Number 1  : ");
        double num1 = input.nextDouble();

        System.out.println("Enter the number 2 : ");
        double num2 = input.nextDouble();

        System.out.println("Enter the Operator to perform Operation (+, -, *, /, %) : ");
        char operator = input.next().charAt(0);

        double result ;

        switch (operator){
            case  '+':
                result = num1 + num2;
                System.out.println("Result of addition num1 + num2 : "+ result);
                break;
            case '-' :
                result = num1 - num2;
                System.out.println("Result of Substraction num1 - num2 : "+ result);
                break;
            case '*' :
                result = num1 * num2;
                System.out.println("Result of Multiplication num1 * num2 : "+ result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("Result of Division num1 / num2 : "+ result);
                break;
            case '%' :
                result = num1 % num2;
                System.out.println("Result of Modulus num1 % num2 : "+ result);
                break;
            default:
                System.out.println("Enter Invalid Operator. Enter the Valid Operator to perform Operation (+, -, *, /, %) : ");
        }
    }
}
