package section_27_collection_framework;
// date : 29-01-2025
import java.util.TreeSet;

class Point implements Comparable<Point>{
    private Integer x;
    private Integer y;

    // constructor
    public Point(){
        System.out.println("default constructor called");
    }
    public Point(Integer x, Integer y){
        this.x = x;
        this.y = y;
    }
    @Override
    public  int compareTo(Point point){
        if (this.x < point.x){
            return -1;
        } else if (this.x > point.x) {
            return 1;
        }
        else {
            if (this.y < point.y){
                return -1;
            } else if (this.y > point.y) {
                return 1;
            }
            else {
                return 0;
            }
        }
    }
    // getters and setters
    public Integer getX(){
        return x;
    }
    public void setX(Integer x){
        this.x = x;
    }
}
public class Example7 {
}
