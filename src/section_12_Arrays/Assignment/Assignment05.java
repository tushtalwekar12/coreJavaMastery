package section_12_Arrays.Assignment;
// Write a java program to create an array with the element {10,25,30,45,50}.
// Take a number as input form the user and use to search the element in array.
// If found , print its index. otherwise display a messege saying the element is not present.

import java.util.Scanner;
public class Assignment05 {
    public static void main(String[] args) {
        int[] nums ={10,25,30,45,50};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number that search in an array :");
        int key = input.nextInt();

        int inFound =-1;

        for (int i=0; i< nums.length; i++){
            if (key == nums[i]){
                inFound = i;
                break;
            }
        }
        // printing an key
         if (inFound != -1){
             System.out.println("element is found at index : "+inFound);
         }else {
             System.out.println("The Element is not present in an array.");
         }
    }
}
