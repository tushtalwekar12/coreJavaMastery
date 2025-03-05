package section_10_Conditional_Statements.Assignment;

import java.util.Scanner;

public class Example02 {
    public static void main(String[] args) {
        /*
Website Type:
Take a website URL and determine its type based on the domain:

.com → Commercial
.org → Organization
.edu → Education
.gov → Government
.net → Network
*/

        Scanner sc = new Scanner(System.in);

        // Taking website URL from the user
        System.out.print("Enter website URL: ");
        String url = sc.next();

        // Finding the last period (.) to get the domain extension
        int pos = url.lastIndexOf('.');
        String domain = url.substring(pos + 1); // Extracting domain after the last "."

        // Switch statement to check website type
        switch (domain) {
            case "com":
                System.out.println("Commercial website");
                break;
            case "org":
                System.out.println("Organizational website");
                break;
            case "edu":
                System.out.println("Educational website");
                break;
            case "gov":
                System.out.println("Government website");
                break;
            case "net":
                System.out.println("Network website");
                break;
            default:
                System.out.println("Unknown website type");
        }
    }
}
