package section_90_tightCoupling;

public class Traverler {
    Bike bike = null;
    //Car car = null;

    public Traverler(){
        this.bike = new Bike();
        //this.car =new Car();

    }
    public void startJourney(){
        this.bike.move();
        //this.car.move();
    }
}
