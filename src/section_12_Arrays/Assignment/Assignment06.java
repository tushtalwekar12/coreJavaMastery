package section_12_Arrays.Assignment;
// print maximum and minimum in an array
public class Assignment06 {
    public static void getMaximum(int[] nums){
        int max =nums[0];
        for (int i=1; i< nums.length; i++){
            if (max < nums[i]){
                max = nums[i];
            }
        }
        System.out.println("the maximum number in an array : "+ max);
    }
    public static void getMinimum(int[] nums){
        int min =nums[0];
        for (int i =1; i< nums.length; i++){
            if (min > nums[i]){
                min =nums[i];
            }
        }
        System.out.println("The minimum number in an array : "+ min);
    }
    public static void main(String[] args) {
        int[] nums ={10,20,30,88,40};
        getMaximum(nums);
        getMinimum(nums);
    }
}
