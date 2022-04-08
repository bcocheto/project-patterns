package facade;

public class CollaboratorFacade {

    public  static  boolean verifyPendencies(Collaborator collaborator) {
        if (Store.getInstance().verifyPendencies(collaborator)) {
                return false;
            }
        return !Inventory.getInstance().verifyPendencies(collaborator);
    }
}
