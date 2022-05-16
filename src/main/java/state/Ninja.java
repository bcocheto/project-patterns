package state;

public class Ninja {

    private String name;
    private Village village;

    public Ninja() {
        this.village = Villager.getInstance();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Village getVillage() {
        return village;
    }

    public void setVillage(Village village) {
        this.village = village;
    }

    public String leafVillage() {
        return village.leafVillage(this);
    }

    public String sandVillage() {
        return village.sandVillage(this);
    }

    public String fogVillage() {
        return village.fogVillage(this);
    }

    public String grassVillage() {
        return village.grassVillage(this);
    }
}
