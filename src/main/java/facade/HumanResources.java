package facade;

import java.util.ArrayList;
import java.util.List;

public abstract class HumanResources {

    private final List<Collaborator> pendingCollaborators = new ArrayList<>();

    public void addPendingCollaborator(Collaborator collaborator){
        this.pendingCollaborators.add(collaborator);
    }

    public  boolean verifyPendencies(Collaborator collaborator){
        return this.pendingCollaborators.contains(collaborator);
    }
}


