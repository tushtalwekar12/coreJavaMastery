package section_13_methods;
// understand how objects are passed to the method
public class Example2 {
    static void update(int A[])
    {
        A[0] = 17;
    }

    static void change(int A[], int index, int value)
    {
        A[index] = value;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};

        for (int x : nums)
        {
            System.out.print(x + " ");
        }

        // Printing Extra New Line
        System.out.println();

        // Updating The value Original Array
        // When objects are passed as a parameter to the
        // method, it's reference (address) is passed.
        update(nums);

        for (int x : nums)
        {
            System.out.print(x+ " ");
        }
        System.out.println();


        change(nums,3,12);
        for (int x : nums)
        {
            System.out.print(x+ " ");
        }
        System.out.println();
    }
}
