package section_12_Arrays;
// Array -
public class Example1 {
    public static void main(String[] args) {
        // creating an Empty array
        int[] nums =new int[5];
        System.out.println(nums.length);

        nums[0] =22;
        nums[1] =23;
        nums[2] =24;
        nums[3] = 25;
        nums[4] = 26;
//      nums[5] = 27; -- it show ArrayIndexOutOfBoundsException


        //
        int[] num1 ={2,3,4,5};
        System.out.println(num1.length);
    }
}
