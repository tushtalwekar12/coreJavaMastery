package section_14_oops1;

class Circle
{
    // data members
    public double radius;

    // member functions
    public double area()
    {
        return Math.PI * radius * radius;
    }

    public double perimeter()
    {
        return 2 * Math.PI * radius;
    }
}
public class Example1 {
    public static void main(String[] args) {
        Circle circle = new Circle();

        System.out.println(circle.area());
        System.out.println(circle.perimeter());

        circle.radius = 10;
        System.out.println("Area      : " + circle.area());
        System.out.println("Perimeter : " + circle.perimeter());

        Circle circle1 = new Circle();

        circle1.radius = 14;
        System.out.println("Area      : " + circle1.area());
        System.out.println("Perimeter : " + circle1.perimeter());
    }

}
