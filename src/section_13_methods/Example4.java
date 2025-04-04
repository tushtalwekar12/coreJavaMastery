package section_13_methods;
//Find a number is prime or not
public class Example4 {
    static boolean isPrime(int num){
        boolean flag = true;
        for (int i=2; i<num/2; i++){
            if (num % i == 0){
                flag = false;
                return flag;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        boolean flag = isPrime(23);
        System.out.println("Prime 23 : "+ flag);

        flag = isPrime(19);
        System.out.println("Prime 19 : "+ flag);

        flag = isPrime(12);
        System.out.println("Prime 12 : " + flag);
    }
}
