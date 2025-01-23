package section_08_operators_Expression.practiceOperator;
// problem : Tax Calculator
import java.util.Scanner;
public class problem1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //take input
        System.out.println("Enter Your Salary: ");
        float salary = sc.nextFloat();

        // variable to store tax
        double tax =0;
        // condition
        if(salary < 250000){
            tax =0;
            System.out.println("No Tax: ");
        } else if (salary < 500000) {

        }
    }
}
