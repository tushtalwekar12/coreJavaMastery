package section_6_Intellije_idea;
// date : 24-01-2025  - debugging example
public class Example2 {
    public static int foo(int a, int b){
        return a+b+5;
    }
    public static void sayHello(){
        for(int i=0; i<10; i++){
            System.out.println("Hello");
        }
        System.out.println("Bye");
    }

    public static void main(String[] args) {
        System.out.print("Statement-1");
        System.out.print("Statement-2");
        int sum = foo(12,13);
        sayHello();
        System.out.println("Statement-3");
        System.out.println("Statement-4");
    }
}
