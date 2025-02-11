package section_14_oops1.Assignment;
class Employee{
    int id;
    String name;
    double salary;

    // Default constructor to set dummy values
    Employee(){
        id =0;
        name ="Unknown";
        salary =0.0;
    }
    // Parameterized constructor to set actual values
    Employee(int id , String name, double salary){
        this.id =id;
        this.name =name;
        this.salary = salary;
    }
    // method
    void showInfo(){
        System.out.println("Employee ID : "+ id);
        System.out.println("Name : "+ name);
        System.out.println("Salary : "+ salary);
    }
}
public class Example02 {
    public static void main(String[] args) {
        // creating employee with default value
        Employee employee1 = new Employee();

        // creating employee with custome value
        Employee employee2 = new Employee(102, "tushar talwekar", 70000.30);

        // call
        System.out.println("Displaying dummy details :");
        employee1.showInfo();
        System.out.println();
        System.out.println("Displaying actual details : ");
        employee2.showInfo();
    }
}
