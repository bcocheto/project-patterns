package state;

public class SandVillageNinja implements Village {

    private SandVillageNinja() {}

    private static final SandVillageNinja instance = new SandVillageNinja();
    public static SandVillageNinja getInstance() {
        return instance;
    }

    public String getVillage() {
        return "Sand Village";
    }

    public String leafVillage(Ninja ninja) {
        return "Does not belong to this village.";
    }

    public String sandVillage(Ninja ninja) {
        return "Belongs to this village.";
    }

    public String fogVillage(Ninja ninja) {
        return "Does not belong to this village.";
    }

    public String grassVillage(Ninja ninja) {
        return "Does not belong to this village.";
    }
}
