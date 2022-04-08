package facade;

public class Store extends HumanResources {

    private static final Store store = new Store();

    private Store(){

    }

    public static Store getInstance(){
        return store;
    }
}
