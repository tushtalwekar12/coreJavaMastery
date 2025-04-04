package section_13_methods;
// Function in Java
public class Example1 {
    // 1. Static Function - static methods  can be accessed from static context only
    static int max(int a, int b){
        if (a > b){
            return a;
        }else {
            return b;
        }
    }

    // 2. Non-Static Function -
    int min(int a, int b){
        if ( a < b){
            return a;
        }else {
            return b;
        }
    }

    // 3. void return type - none return
    void modifyPrimitives(int a){
        System.out.println("Function : "+  a);
        a++;
        System.out.println("Function : "+ a);
        return;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        //1. static function call
        int c = max(a,b); // 15
        System.out.println("max : "+ c);

        // 2. non-static function - create a object
        Example1 instance = new Example1();
        c = instance.min(a,b);

        System.out.println("Min : "+ c);

        // when passing primitive variables as parameters to the method ,
        // their value is copied to formal parameters
        instance.modifyPrimitives(a);

        System.out.println("main : "+ a);
    }
}
//