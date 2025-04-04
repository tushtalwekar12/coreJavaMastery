package section_11_Iterative_statement_loops;

public class Example2 {
    public static void main(String[] args) {
        // Question -1 counting the number of digits
//        int x = 123;
//        int count = 0;
//        while (x != 0){
//            x = x/10;
//            // update
//            count ++;
//        }
//        System.out.println("the number of digits :"+ count);
// ------------------------------------------------------------------------
        // Question -2 sum of digits
//        int y = 123;
//        int sum = 0;
//        while (y != 0) {
//            int remainder = y % 10;  // Get the last digit
//            sum += remainder;   //sum = sum + digits;  Add the digit to the sum
//            y /= 10;            // y = y / 10;  Remove the last digit
//        }
//        System.out.println("sum of digits : "+ sum);
        // .........................................................................
        // find GCD :
        int m = 145;
        int n = 100;

        while (m != n){
            if (m > n){
                m = m -n;
            }else {
                n = n - m;
            }
            System.out.println("gcd "+ m);
        }
    }
}
