package section_09_string_class_and_printing;

public class Example0 {
    public static void main(String[] args) {
        int lnNum1 = 10;
        float lfNum1 = 12.003456f;
        boolean isEven = true;

        // printing text
        System.out.println("Hello JVM");
        System.out.println("This is Window Platform");

        System.out.println("JavaCompiler Gives Byte Code");
        System.out.println("JVM Reads The Bytes code line By and Execute on Target Platform");

        // print Content of Variables
        System.out.println(lnNum1);
        System.out.println(lfNum1);

        System.out.printf("Integer Number %d \n", lnNum1);
        System.out.printf("Float Number2  %f  \n",lfNum1);
        System.out.printf("Boolean Value %b \n",isEven);

        String formatedString = String.format("lnNum1: %d , lfNum1 : %f , isEven : %b", lnNum1, lfNum1, isEven);
        System.out.println(formatedString);


    }
}