package memento;

import java.util.ArrayList;
import java.util.List;

public class Ninja {

    private String name;
    private Jutsu jutsu;
    private final List<Jutsu> memento = new ArrayList<>();

    public Ninja() {
        this.jutsu = Hokage.getInstance();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Jutsu getJutsu() {
        return this.jutsu;
    }

    public void setJutsu(Jutsu jutsu) {
        this.jutsu = jutsu;
        this.memento.add(this.jutsu);
    }

    public String knowSuiton() {
        return jutsu.knowSuiton(this);
    }

    public String knowKaton() {
        return jutsu.knowKaton(this);
    }

    public String knowDoton() {
        return jutsu.knowDoton(this);
    }

    public String knowFuuton() {
        return jutsu.knowFuuton(this);
    }

    public void restoreJutsus(int index) {
        if (index < 0 || index > this.memento.size() - 1) {
            throw new IllegalArgumentException("invalid index");
        }
        this.jutsu = this.memento.get(index);
    }

    public List<Jutsu> getJutsus() {
        return this.memento;
    }
}
