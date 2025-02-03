package section_08_operators_Expression;

public class Example10 {
    public static void main(String[] args) {
        int x = 10;
        int y = 6;
        int z;

        z = x & y;
        System.out.println(z);

        z = x | y;
        System.out.println(z);

        z = x ^ y;
        System.out.println(z);

        int result;

        result = x;
        System.out.println("Bit Pattern : "+ Integer.toBinaryString(result));

        result = ~x;
        System.out.println("Bit Pattern :" +Integer.toBinaryString(result));

        result = x << 1;
        System.out.println("Result :  "+ result);

        result = y >> 1;
        System.out.println("Result : "+ result);
    }
}
