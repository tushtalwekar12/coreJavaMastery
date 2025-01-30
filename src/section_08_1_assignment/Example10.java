package section_08_1_assignment;
//Calculate the absolute difference between the largest and smallest of three
//numbers using Math.max() and Math.min()
import java.util.*;
public class Example10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));

        System.out.println("Absolute Difference: " + Math.abs(max - min));
    }
}
