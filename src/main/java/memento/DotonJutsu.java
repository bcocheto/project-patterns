package memento;

public class DotonJutsu implements Jutsu {

    private DotonJutsu() {}

    private static final DotonJutsu instance = new DotonJutsu();
    public static DotonJutsu getInstance() {
        return instance;
    }

    public String getJutsu() {
        return "Doton jutsu";
    }

    public String knowSuiton(Ninja ninja) {
        return "No";
    }

    public String knowKaton(Ninja ninja) {
        return "No";
    }

    public String knowDoton(Ninja ninja) {
        return "Yes";
    }

    public String knowFuuton(Ninja ninja) {
        return "No";
    }
}
