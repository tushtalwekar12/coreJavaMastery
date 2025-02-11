package section_14_oops1.Assignment;
class Circle {
    double radius;

    // method to calculate area -
    void calculateArea(){
        double area = Math.PI * radius * radius;
        System.out.println("Area of the Circle : "+ area);
    }

    // method to calculate circumference
    void calculateCircumference(){
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of the circle : "+ circumference);
    }
}
public class Example03 {
    public static void main(String[] args) {
        // craete object of Circle class
        Circle circle1 = new Circle();

        // assign value to radius
        circle1.radius =5.0;

        // call method
        circle1.calculateArea();
        System.out.println();
        circle1.calculateCircumference();
    }
}
