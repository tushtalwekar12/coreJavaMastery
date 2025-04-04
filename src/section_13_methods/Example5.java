package section_13_methods;
// Find GCD of two numbers
public class Example5 {
    static int gcd(int m, int n){
        while (n != m){
            if (m>n){
                m = m-n;
            }else {
                n = n-m;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        int result = gcd(45,115);
        System.out.println("Gcd of 45 and 115 : "+ result);
    }
}
