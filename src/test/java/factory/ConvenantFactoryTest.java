package factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvenantFactoryTest {
    @Test
    void shouldReturnExceptionForContractNonexistent() {
        try {
            Convenant convenant = ConvenantFactory.getConvenant("QA");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Convenant not found", e.getMessage());
        }
    }

    @Test
    void shouldReturnExceptionForInvalidContract() {
        try {
            Convenant convenant = ConvenantFactory.getConvenant("Senior");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid convenant", e.getMessage());
        }
    }
}