package memento;

public class SuitonJutsu implements Jutsu {

    private SuitonJutsu() {}

    private static final SuitonJutsu instance = new SuitonJutsu();
    public static SuitonJutsu getInstance() {
        return instance;
    }

    public String getJutsu() {
        return "Suiton jutsu";
    }

    public String knowSuiton(Ninja ninja) {
        return "Yes";
    }

    public String knowKaton(Ninja ninja) {
        return "No";
    }

    public String knowDoton(Ninja ninja) {
        return "No";
    }

    public String knowFuuton(Ninja ninja) {
        return "No";
    }
}
