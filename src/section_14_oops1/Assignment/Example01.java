package section_14_oops1.Assignment;
class Student {
    int rollNumber;
    String name ;
    float marks;

    // method
    void displayDetails(){
        System.out.println("Roll No : "+ rollNumber);
        System.out.println("Name : "+ name);
        System.out.println("Marks : "+ marks);
    }
}
public class Example01 {
    public static void main(String[] args) {
        // create student class object
        Student student = new Student();

        System.out.println("Student Details : ");
        // Assigning value directly to field
        student.rollNumber = 1;
        student.name ="Tushar Talwekar";
        student.marks = 99.9f;

        // call method
        student.displayDetails();
    }
}
