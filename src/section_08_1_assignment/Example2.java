package section_08_1_assignment;
//Calculate the hypotenuse of a triangle using
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input a
        System.out.print("enter the value of a :");
        double a = sc.nextDouble();

        // input b
        System.out.print("enter the value of b :");
        double b = sc.nextDouble();

        // calculate hypotenuse -
        double c = Math.sqrt(Math.pow(a,2)+ Math.pow(b,2));

        System.out.print(" hypotenuse of tringle is : "+ c);
    }
}
