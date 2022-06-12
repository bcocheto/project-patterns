package memento;

public class FuutonJutsu implements Jutsu {

    private FuutonJutsu() {}

    private static final FuutonJutsu instance = new FuutonJutsu();
    public static FuutonJutsu getInstance() {
        return instance;
    }

    public String getJutsu() {
        return "Fuuton jutsu";
    }

    public String knowSuiton(Ninja ninja) {
        return "No";
    }

    public String knowKaton(Ninja ninja) {
        return "No";
    }

    public String knowDoton(Ninja ninja) {
        return "No";
    }

    public String knowFuuton(Ninja ninja) {
        return "Yes";
    }
}
