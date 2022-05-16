package state;

public class LeafVillageNinja implements Village {

    private LeafVillageNinja() {}

    private static final LeafVillageNinja instance = new LeafVillageNinja();
    public static LeafVillageNinja getInstance() {
        return instance;
    }

    public String getVillage() {
        return "Leaf Village";
    }

    public String leafVillage(Ninja ninja) {
        return "Belongs to this village.";
    }

    public String sandVillage(Ninja ninja) {
        return "Does not belong to this village.";
    }

    public String fogVillage(Ninja ninja) {
        return "Does not belong to this village.";
    }

    public String grassVillage(Ninja ninja) {
        return "Does not belong to this village.";
    }
}
