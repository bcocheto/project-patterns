package state;

public class Villager implements Village {

    private Villager() {}

    private static final Villager instance = new Villager();
    public static Villager getInstance() {
        return instance;
    }

    public String getVillage() {
        return "Ninja";
    }

    public String leafVillage(Ninja ninja) {
        ninja.setVillage(LeafVillageNinja.getInstance());
        return "Leaf ninja";
    }

    public String sandVillage(Ninja ninja) {
        ninja.setVillage(SandVillageNinja.getInstance());
        return "Sand ninja";
    }

    public String fogVillage(Ninja ninja) {
        ninja.setVillage(FogVillageNinja.getInstance());
        return "Fog ninja";
    }

    public String grassVillage(Ninja ninja) {
        ninja.setVillage(GrassVillageNinja.getInstance());
        return "Grass ninja";
    }


}
