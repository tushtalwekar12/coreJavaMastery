package section_08_operators_Expression;
// merging and masking
public class Example12 {
    public static void main(String[] args) {
        int a =0b100010010011100;
        int x = 0b000000000000001;

        // setting the status of ith bit
        int z ;

        // masking operation
        // left shift & Bitwise AND operation
        x  = x<<7;
        z = a & x;

        if (z != 0){
            System.out.println("7th Bit is Active");
        }else {
            System.out.print("7th Bit is not Active");
        }

        // Merging Operation
        x = 1;
        x = x<<8;  //0b000000100000000;
        a = a | x;
    }
}
