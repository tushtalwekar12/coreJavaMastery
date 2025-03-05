package section_10_Conditional_Statements.Assignment;
import java.util.Scanner;
// Find the radix of a number given in string
public class Example07 {
    public static void main(String[] args) {
        String num = "1234";

        if(num.matches("[01]+")){
            System.out.println("Radix 2");
        } else if (num.matches("[0-9]+")) {
            System.out.println("Radix 10");
        }else {
            System.out.println("nothing");
        }
    }
}
