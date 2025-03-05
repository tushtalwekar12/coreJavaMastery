package section_10_Conditional_Statements.Assignment;
import java.util.Scanner;
// Take 3 marks of subject , find average
public class Example06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the marks of English : ");
        double english = input.nextDouble();

        System.out.println("Enter the marks of Math : ");
        double math = input.nextDouble();

        System.out.println("Enter the marks of Physics : ");
        double physics = input.nextDouble();

        double avg = (english + math + physics) / 3;

        if (avg >= 70){
            System.out.println("Grade A");
        } else if (avg >= 60) {
            System.out.println("Grade B");
        } else if (avg >= 50 && avg < 60) {
            System.out.println("Grade C");
        } else if (avg >= 40 && avg < 50) {
            System.out.println("Grade D");
        }else {
            System.out.println("Grade F");
        }
    }
}
