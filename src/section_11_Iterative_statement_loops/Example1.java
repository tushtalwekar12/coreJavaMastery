package section_11_Iterative_statement_loops;
// switch statement - are internally compiled into lookUp Table (hashTable)
public class Example1 {
    public static void main(String[] args) {
        // Example-1
        int day = 22;
//        switch (day){
//            case 1 :
//                System.out.println("Monday");
//                break;
//            case 2 :
//                System.out.println("Tuesday");
//                break;
//            case 3 :
//                System.out.println("Wednesday");
//                break;
//            case 4 :
//                System.out.println("Thusday");
//                break;
//            case 5 :
//                System.out.println("Friday");
//                break;
//            case 6 :
//                System.out.println("Saturday");
//                break;
//            case 7 :
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Not a valid day");
     //   }

        // Example-2
//        int a = 3;
//        switch (a){
//            case 3 :
//            case 5 :
//            case 9 :
//            case 12 :
//                System.out.println("Hello");
//        }
        // Example-3
        String str = "www.google.org";
        int pos = str.lastIndexOf("."); // position (index) of this dot is stored in the integer variable pos.
        String data = str.substring(pos + 1); //data becomes "org"
        switch (data){
            case "com" :
                System.out.println("Commersial website");
                break;
            case "edu" :
                System.out.println("Educational website");
                break;
            case "org":
                System.out.println("Organizational website");
                break;
            case "net":
                System.out.println("network websites");
            default:
                System.out.println("none of");
        }
    }
}
