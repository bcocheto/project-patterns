package facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollaboratorTest {

    @Test
    public void shouldReturnPendingCollaborator(){
        Collaborator collaborator = new Collaborator();
        Store.getInstance().addPendingCollaborator(collaborator);

        assertFalse(collaborator.sell());
    }

    @Test
    public void shouldReturnPendingInventoryWithCollaborator(){
        Collaborator collaborator = new Collaborator();
        Inventory.getInstance().addPendingCollaborator(collaborator);

        assertFalse(collaborator.sell());
    }

    @Test
    public void shouldReturnNoPendingCollaborator(){
        Collaborator collaborator = new Collaborator();

        assertTrue(collaborator.sell());
    }


}