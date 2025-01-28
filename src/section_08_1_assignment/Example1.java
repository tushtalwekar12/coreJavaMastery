package section_08_1_assignment;
//Write a program to calculate a
//b using Math.pow(a, b).
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input a
        System.out.println("enter the value ");
        int a = sc.nextInt();

        // input b
        System.out.println("eneter the value of b : ");
        int b = sc.nextInt();

        // calculate power
        double power = Math.pow(a, b);
        System.out.println("the power of : "+ power);
    }
}
