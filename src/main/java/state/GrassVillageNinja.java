package state;

public class GrassVillageNinja implements Village {

    private GrassVillageNinja() {}

    private static final GrassVillageNinja instance = new GrassVillageNinja();
    public static GrassVillageNinja getInstance() {
        return instance;
    }

    public String getVillage() {
        return "Grass Village";
    }

    public String leafVillage(Ninja ninja) {
        return "Does not belong to this village.";
    }

    public String sandVillage(Ninja ninja) {
        return "Does not belong to this village.";
    }

    public String fogVillage(Ninja ninja) {
        return "Does not belong to this village.";
    }

    public String grassVillage(Ninja ninja) {
        return "Belongs to this village.";
    }
}
