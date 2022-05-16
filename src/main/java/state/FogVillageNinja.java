package state;

public class FogVillageNinja implements Village {

    private FogVillageNinja() {}

    private static final FogVillageNinja instance = new FogVillageNinja();
    public static FogVillageNinja getInstance() {
        return instance;
    }

    public String getVillage() {
        return "Fog Village";
    }

    public String leafVillage(Ninja ninja) {
        return "Does not belong to this village.";
    }

    public String sandVillage(Ninja ninja) {
        return "Does not belong to this village.";
    }

    public String fogVillage(Ninja ninja) {
        return "Belong to this village.";
    }

    public String grassVillage(Ninja ninja) {
        return "Does not belong to this village.";
    }
}
