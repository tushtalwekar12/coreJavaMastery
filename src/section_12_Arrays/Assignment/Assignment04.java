package section_12_Arrays.Assignment;
// Write a Java program to create an array with the elements {5, 10, 15, 20, 25}. Use a for loop to
//calculate and print the sum of all elements in the array.
public class Assignment04 {
    public static void main(String[] args) {
        int[] nums ={5,10,15,20,25};

        int sum =0;

//        for (int i=0; i< nums.length; i++){
//            int curr_element =nums[i];
//            sum = sum + curr_element; // sum = previous sum + current element;
//        }
        // or
        for (int num : nums){
            sum += num;
        }
        System.out.println("sum is : "+ sum);
    }
}
