package section_14_oops1.Assignment;
class MathHelper{
    // static add method
    public static int add(int a , int b){
        return a + b;
    }
    // static subtract method
    public static int subtract(int a , int b){
        return a - b;
    }
    // static multiply method
    public static int multiply(int a, int b){
        return a * b;
    }
}
public class Example05 {
    public static void main(String[] args) {
        // using MathHelper method without creating an object
        int sum = MathHelper.add(10,5);
        int difference = MathHelper.subtract(10,5);
        int product = MathHelper.multiply(10,5);

        // print
        System.out.println("Sum : "+sum);
        System.out.println("Difference : "+difference);
        System.out.println("Product : "+ product);
    }
}
