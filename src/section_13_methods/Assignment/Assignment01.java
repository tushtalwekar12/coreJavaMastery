package section_13_methods.Assignment;
// Assignment - function / method
public class Assignment01 {
    public static int max(int a, int b){
        if (a > b ){
            return a;
        }
        return b;
    }
    public static int min(int a, int b){
        if (a < b){
            return a;
        }
        return b;
    }

    public static int addTwoNumbers(int a , int b){
        return a + b;
    }

    public static int multiplyTwoNumbers(int a, int b){
        return a * b;
    }

    public static int divisionTwoNumbers(int a, int b){
        return a / b;
    }

    public static int substractTwoNumbers(int a, int b){
        return a - b;
    }

    public static int findModulus(int a, int b){
        return a % b;
    }

    public static void displayArray(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static float calculateVolume(float fl, float fb, float fh){
        float volume = fl * fb * fh;
        return volume;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int[] arr ={2,3,4,5,6};

        float fl ;
        float fb ;
        float fh ;

        float result = calculateVolume(12f, 10.0f, 6f);
        System.out.println("The volume of the room is : "+ result);

        // find max
        int c = max(a,b);
        System.out.println("The max of a and b is : "+ c);
        // 1. find min()
        System.out.println("The min is : "+ min(a,b));

        // 2. add() two numbers
        System.out.println("Addition of a + b : "+ addTwoNumbers(a,b));

        // 3.multiply two numbers
        System.out.println("mutiply Two Number a * b : "+ multiplyTwoNumbers(a,b));

        // 4. division
        System.out.println("division of a / b : "+ divisionTwoNumbers(a,b));

        // 5. substract Two Numbers
        System.out.println("Subtract a - b : "+ substractTwoNumbers(a,b));

        // 6. modulus of the number
        System.out.println("Modulus of a % b : "+ findModulus(a,b));

        // 7. display(int[] A
//        System.out.println(displayArray(arr));
        displayArray(arr);

    }
}
