package observer;

import java.util.Observable;
import java.util.Observer;

public class Client implements Observer {

    private final String name;
    private String lastTrack;

    public Client(String name) {
        this.name = name;
    }

    public String getLastTrack() {
        return this.lastTrack;
    }

    public void trackBack(Tracker tracker) {
        tracker.addObserver(this);
    }

    public void update(Observable order, Object arg) {
        this.lastTrack = this.name + " Last update " + order.toString();
    }
}
