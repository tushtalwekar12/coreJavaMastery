package section_10_Conditional_Statements;
import java.util.Scanner;
// switch statement - are internally compiled into lookUp Table (hashTable);
public class Example2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // coffee vending machine
        System.out.println("Here is Menu Card : \n 1.Black Coffee : $2 \n 2.Milked Coffee : $3 \n 3.Cappatino Coffee : $4 \n 4.Arabica : $5 \n 5.Robusta : $6 ");
        System.out.println("enter the amount : ");
        String amount = input.nextLine();

        switch (amount){
            case "$2" :
                System.out.println("Here is Your Black Coffee !");
                break;
            case "$3" :
                System.out.println("Here is Your Milked Coffee !");
                break;
            case "$4" :
                System.out.println("Here is Your Cappatino Coffee !");
                break;
            case "$5" :
                System.out.println("Here is Your Arabica Coffee !");
                break;
            case "$6" :
                System.out.println("Here is Your Robusta Coffee !");
                break;
            default:
                System.out.println("You entered Wrong input.");
        }
    }
}
