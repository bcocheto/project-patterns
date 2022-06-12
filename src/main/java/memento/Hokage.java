package memento;

public class Hokage implements Jutsu {

    private Hokage() {}

    private static final Hokage instance = new Hokage();
    public static Hokage getInstance() {
        return instance;
    }

    public String getJutsu() {
        return "Hokage";
    }

    public String knowSuiton(Ninja ninja) {
        ninja.setJutsu(SuitonJutsu.getInstance());
        return "Yes";
    }

    public String knowKaton(Ninja ninja) {
        ninja.setJutsu(KatonJutsu.getInstance());
        return "Yes";
    }

    public String knowDoton(Ninja ninja) {
        ninja.setJutsu(DotonJutsu.getInstance());
        return "Yes";
    }

    public String knowFuuton(Ninja ninja) {
        ninja.setJutsu(FuutonJutsu.getInstance());
        return "Yes";
    }


}
