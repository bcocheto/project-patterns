package memento;

public class KatonJutsu implements Jutsu {

    private KatonJutsu() {}

    private static final KatonJutsu instance = new KatonJutsu();
    public static KatonJutsu getInstance() {
        return instance;
    }

    public String getJutsu() {
        return "Katon jutsu";
    }

    public String knowSuiton(Ninja ninja) {
        return "No";
    }

    public String knowKaton(Ninja ninja) {
        return "Yes";
    }

    public String knowDoton(Ninja ninja) {
        return "No";
    }

    public String knowFuuton(Ninja ninja) {
        return "No";
    }
}
