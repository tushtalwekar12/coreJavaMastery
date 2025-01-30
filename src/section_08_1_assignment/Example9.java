package section_08_1_assignment;
//Find the base-10 logarithm of a number using Math.log10().

import java.util.*;
public class Example9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        double num = sc.nextDouble();
        // print
        System.out.println("Log base 10: " + Math.log10(num));
    }
}
