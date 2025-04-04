package section_10_Conditional_Statements;
import java.util.Scanner;
// Conditional Statement - is a set of statement which get executed based on the value of the condition
public class Example1 {
    public static void main(String[] args) {
        // 1. if else statement -
        int age = 10;
        if (age < 18){
            System.out.println("You are eligible");
        }else {
            System.out.println("You are not eligible");
        }

        //  2. if Statement
        if (2 == 2){
            System.out.println("2 is equal to 2");
        }
    }
}
