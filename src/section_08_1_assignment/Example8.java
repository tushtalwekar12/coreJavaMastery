package section_08_1_assignment;
// Verify the trigonometric identity:
import java.util.*;
public class Example8 {
    public static void main(String[] args) {
       //
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double degrees = sc.nextDouble();
        double radians = Math.toRadians(degrees);
        double sum = Math.pow(Math.sin(radians), 2) + Math.pow(Math.cos(radians), 2);
        System.out.println("Identity Verified: " + (Math.abs(sum - 1) < 1e-9));

    }
}
