package section_07_datatypes_variable;
// check size and number of bytes of a given datatype
import java.util.jar.JarOutputStream;

public class Example2
{
    public static void main(String[] args) {
        System.out.println("Minimum value of Integer : "+ Integer.MIN_VALUE);
        System.out.println("Maximum value of Integere : "+ Integer.MAX_VALUE);
        System.out.println("Size of Integer : "+ Integer.SIZE);
        System.out.println("Number of Bytes in Integer : "+ Integer.BYTES);

        System.out.println();

        System.out.println("Minimum Value : "+ Character.MIN_VALUE);
        System.out.println("Maximum Value : "+ Character.MAX_VALUE);
        System.out.println("Size of Character :" +Character.SIZE);
        System.out.println("Number of Bytes : "+ Character.BYTES);

        System.out.println();

        System.out.println("Minimum value : "+ Float.MIN_VALUE);
        System.out.println("Maximum Value : "+ Float.MAX_VALUE);
        System.out.println("Size of Float : "+ Float.SIZE);
        System.out.println("Number of Bytes : "+ Float.BYTES);

        System.out.println();

        System.out.println("Minimum value : "+ Double.MIN_VALUE);
        System.out.println("Maximum Value : "+ Double.MAX_VALUE);
        System.out.println("Size of Float : "+ Double.SIZE);
        System.out.println("Number of Bytes : "+Double.BYTES);

        System.out.println();

        System.out.println("Minimum value is : "+ Long.MIN_VALUE);
        System.out.println("Maximum value is : "+ Long.MAX_VALUE);
        System.out.println("Size of Long : "+ Long.SIZE);
        System.out.println("Number of Bytes : "+ Long.BYTES);

        System.out.println();

        System.out.println("Minimum value is : "+ Short.MIN_VALUE);
        System.out.println("Maximum value is : "+ Short.MAX_VALUE);
        System.out.println("Size of Short : "+ Short.SIZE);
        System.out.println("Numbers of Bytes : "+ Short.BYTES);

        System.out.println();

        System.out.println("Minimum value is : "+Byte.MIN_VALUE);
        System.out.println("Maximum value is : "+Byte.MAX_VALUE);
        System.out.println("Size of Bytes : "+ Byte.SIZE);
        System.out.println("Numbers of Bytes : "+ Byte.BYTES);

        System.out.println();
    }
}
