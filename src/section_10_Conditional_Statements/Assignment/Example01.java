package section_10_Conditional_Statements.Assignment;
// question 1 : Display the name of month based on number using switch case.
import java.util.Scanner;
public class Example01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();

        switch (month){
            case 1 :
                System.out.println("January");
                break;
            case 2 :
                System.out.println("February");
                break;
            case 3 :
                System.out.println("March");
                break;
            case 4 :
                System.out.println("April");
                break;
            case 5 :
                System.out.println("May");
                break;
            case 6 :
                System.out.println("June");
                break;
            case 7 :
                System.out.println("July");
                break;
            case 8 :
                System.out.println("August");
                break;
            case 9 :
                System.out.println("September");
                break;
            case 10 :
                System.out.println("Octomber");
                break;
            case 11 :
                System.out.println("November");
                break;
            case 12 :
                System.out.println("December");
                break;
            default:
                System.out.println("Wrong number you entered. entered number between 1 to 12 : ");
        }
    }
}
