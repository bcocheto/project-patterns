package chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContractTest {

    ImplantationContribuitor implantation;
    ProductMananger pm;

    @BeforeEach
    void setUp() {
        pm = new ProductMananger(null);
        implantation = new ImplantationContribuitor(pm);
    }

    @Test
    void shouldReturnImplantationType() {
        assertEquals("Implantation", implantation.signContract(new Contract(ContractTypeJunior.getTypeJunior())));
    }

    @Test
    void shouldReturnProductManangerType() {
        assertEquals("Product Mananger", implantation.signContract(new Contract(ContractTypePlenary.getTypePlenary())));
    }

}