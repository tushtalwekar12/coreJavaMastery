package section_10_Conditional_Statements.Assignment;
import java.util.Scanner;
/* Example-1
 Day of the Week:
Write a Java program that takes a number (1–7) and prints the day of the week. For example:
1 → Monday
2 → Tuesday
…and so on.
Use a switch statement to handle this.
 */
public class Example09 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("program for select the day of the week , monday to Sunday => monday=1, Tuesday=2, so on...");
      System.out.println("Enter the number between 1 to 7 : ");
      int day = input.nextInt();
        switch (day) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thusday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a Valid day");
        }
    }
}
