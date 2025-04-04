package section_12_Arrays.Assignment;
// Assignment-1 :write an java program to create  an array with the element {10,20,30,40,50,60}.
// print the array element in forward order and then in reverse order.
public class Assignment01 {
    public static void reverseArray(int[] nums){
        int first =0;
        int last = nums.length-1;

        while (first < last){
            int temp = nums[last];
            nums[last] =nums[first];
            nums[first] = temp;

            first++;
            last--;
        }
    }
    public static void printArray(int[] nums){
        System.out.println("Reverse Array : ");
        for (int i=0; i<nums.length; i++){
            System.out.print(nums[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int[] nums ={10,20,30,40,50,60};
        // print original array
        System.out.println("Original Array :");
        for (int arr : nums){
            System.out.print(arr +" ");
        }
        System.out.println();
        // print Reverse array
        reverseArray(nums);
        printArray(nums);
    }
}
