package section_08_1_assignment;
//Generate a random integer between min and max using Math.random().
import java.util.*;
public class Example6 {
        public static int random_num(int min, int max) {

            return (int)(Math.random() * (max - min + 1)) + min;
        }
        public static void main(String[] args) {
            int randomNum = random_num(1, 10); // Random integer between 1 and 10
            System.out.println("Random Number: " + randomNum);
        }
}
