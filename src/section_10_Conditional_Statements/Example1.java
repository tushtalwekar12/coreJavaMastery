package section_10_Conditional_Statements;
import java.util.Scanner;
// switch statement - are internally compiled into lookUp Table (hashTable)
public class Example1 {
    /* Example-1
1️⃣ Day of the Week:
Write a Java program that takes a number (1–7) and prints the day of the week. For example:
1 → Monday
2 → Tuesday
…and so on.
Use a switch statement to handle this.
 */

    public static void main(String[] args) {
        int day = 22 ;
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
