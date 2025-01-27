package section_08_operators_Expression;
// calculate area of tringle  - base * height /2
import java.util.Scanner;
public class Example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float lfBase;
        float lfHeigth;

        System.out.print("Enter the value of Base :");
        lfBase = sc.nextFloat();

        System.out.println("Enter the value of Height :");
        lfHeigth = sc.nextFloat();

        float lfArea = (lfBase * lfHeigth)/2;
        System.out.println("Area of tringle : "+ lfArea);
    }
}
