package section_08_operators_Expression;
// calculate area
import java.util.Scanner;
public class Example5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float  a;
        float b;
        float c;

        float s;
        float area;

        System.out.println("Enter the length of side a : ");
        a = sc.nextFloat();

        System.out.println("Enter the length of side b :");
        b = sc.nextFloat();

        System.out.println("Enter the length of side c :");
        c = sc.nextFloat();

        // to calculate s
        s = (a+b+c)/2f;

        // calculate area
        area = (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area Of Triangle : " + area);
    }
}
