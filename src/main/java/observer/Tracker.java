package observer;

import java.util.Observable;

public class Tracker extends Observable {

    private final String order;

    public Tracker(String order, String address) {
        this.order = order;
    }

    public void changeStatus(){
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return  this.order;
    }
}
