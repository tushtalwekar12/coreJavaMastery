package section_10_Conditional_Statements;
import java.util.Scanner;
// leap year
public class Example3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = input.nextInt();

//        if(year % 4 == 0){
//            if (year % 100 == 0){
//                if (year % 400 == 0){
//                    System.out.println("Leap year");
//                }else {
//                    System.out.println("not a leap year");
//                }
//            }else {
//                System.out.println("Leap year");
//            }
//        }else {
//            System.out.println("not a leap year");
//        }
        // or
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("leap year");
        }else {
            System.out.println("not leap year");
        }
    }
}
