package section_08_operators_Expression;
//date :23-01-2024
//
public class Example1 {
    public static void main(String[] args) {
        // Airthmetic operator
        byte lbNum =12;
        short lnNum = 200;
        long llSum = 22888888L;
        //Byte + short --> Integer
        int lnSum = lbNum + lnNum;
        System.out.println(lnSum);

        // Integer + Integer = Integer
        lnSum = lnNum +12000;
        System.out.println(lnSum);

        // Long + integer = Long
        llSum = lnNum +1234567L;
        System.out.println(llSum);
    }
}
