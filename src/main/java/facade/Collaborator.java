package facade;

public class Collaborator {


    public boolean sell(){
        return CollaboratorFacade.verifyPendencies(this);
    }
}
