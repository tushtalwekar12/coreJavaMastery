package section_08_1_assignment;
// Convert an angle from degrees to radians using:
import java.util.*;

public class Example7 {
    public static void main(String[] args) {
        //
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter degrees: ");
        double degrees = sc.nextDouble();
        double radians = degrees * Math.PI / 180;
        System.out.println("Radians: " + radians);
        System.out.println("Using Math.toRadians: " + Math.toRadians(degrees));
    }
}
