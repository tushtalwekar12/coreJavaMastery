package section_26_generics;

class MyDisplay<T>{
    T t;
    T getData(){
        return this.t;
    }
    void setData(T t){
        this.t = t;
    }
}
class person {
    String name;
    int age;
}
class Student{
    public String name;
    public int roll;
}
public class Example2 {
   public static void main(String [] args){
       MyDisplay<Integer> instance  = new MyDisplay<>();
       instance.setData(12);
       System.out.println(instance.getData());

       MyDisplay<String> instance2 = new MyDisplay<String>();
       instance2.setData("My Data");
       System.out.println(instance2.getData());

       Student  s1 = new Student();
       s1.name ="Vaibhav";
       s1.roll = 1212;

       MyDisplay<Student> instance3 = new MyDisplay<>();
       instance3.setData(s1);
       System.out.println(instance3.getData());
   }
}
