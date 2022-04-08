package facade;

public class Inventory extends HumanResources {

    private static final Inventory inventory = new Inventory();

    private Inventory(){

    }

    public static Inventory getInstance(){
        return inventory;
    }
}
