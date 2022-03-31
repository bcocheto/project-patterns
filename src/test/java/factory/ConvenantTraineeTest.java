package factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvenantTraineeTest {

    @Test
    void shouldExecuteContracting() {
        Convenant convenant = ConvenantFactory.getConvenant("Trainee");
        assertEquals("Convenant effectived", convenant.hire());
    }

    @Test
    void shouldReturnContract() {
        Convenant convenant = ConvenantFactory.getConvenant("Trainee");
        assertEquals("Convenant trainee", convenant.print());
    }

    @Test
    void shouldExecuteDismissal() {
        Convenant convenant = ConvenantFactory.getConvenant("Trainee");
        assertEquals("Convenant recind", convenant.dimiss());
    }
}