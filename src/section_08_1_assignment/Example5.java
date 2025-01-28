package section_08_1_assignment;
//Calculate n! using the formula: n! = e
//ln(1)+ln(2)+···+ln(n)
import java.util.*;
public class Example5 {
    public static void main(String[] args) {
        double result = 0;

        for(int i=1; i<=5; i++){
            result = result + Math.log(i);
        }

    }
}
