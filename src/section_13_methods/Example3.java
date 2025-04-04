package section_13_methods;
// A method can return Object also
public class Example3 {
    static String findUsername(String email){
        int a = email.indexOf('@');
        String name = email.substring(0,a);
        return name;
    }


    public static void main(String[] args){
        String email ="S2p@gmail.com";
        String username =findUsername(email);

        System.out.println("Email : "+ email);
        System.out.println("Username : "+ username);
    }

}
