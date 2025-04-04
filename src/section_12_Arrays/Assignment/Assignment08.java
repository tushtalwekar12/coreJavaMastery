package section_12_Arrays.Assignment;
// Right Rotate array -
public class Assignment08 {
    public static void rightRotate(int nums[]){
        int temp =nums[nums.length-1]; // 17 - store last element

        // Shift elements to the right
        for (int i= nums.length-2; i>=0; i--){
            nums[i+1] = nums[i];
        }
        nums[0] =temp; // Place the last element at the first position

        // print an array
        for (int i=0; i< nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] nums ={45,26,9,10,17};
        rightRotate(nums); // call
    }
}
