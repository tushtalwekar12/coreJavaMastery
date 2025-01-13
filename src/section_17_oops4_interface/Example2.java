// date : 13-01-2025
package section_17_oops4_interface;

interface Imusicplayer{
    void play();
    void stop();
    void next();
    void prev();
    void pause();
}
interface Ac{
    void turnOn();
    void turnOff();
}
// mycar => child , Imusicplayer , Ac => parents
class myCar implements Imusicplayer, Ac{

    @Override
    public void turnOn() {
        System.out.println("turn on Music Player");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off Ac");

    }

    @Override
    public void play() {
        System.out.println("Play Musics");

    }

    @Override
    public void stop() {
        System.out.println("Stop Musics");

    }

    @Override
    public void next() {
        System.out.println("Play next music");

    }

    @Override
    public void prev() {
        System.out.println("Play previsous one");

    }

    @Override
    public void pause() {
        System.out.println("Pause the music");
    }
}

public class Example2 {
    public static void main(String [] args){
        myCar car = new myCar(); // car object of myCar class and have access of all 7 methods
        car.play();
        car.next();
        car.turnOff();

        // parents can hold the objects of childs
        // musicPlayer object can have the access of 5 methods and 2 are hidden that concept is overshadowing
        Imusicplayer musicPlayer = new myCar();
        musicPlayer.pause();
        musicPlayer.play();

        Ac ac = new myCar();
        ac.turnOn();
    }
}

