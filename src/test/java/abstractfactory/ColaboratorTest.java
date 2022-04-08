package abstractfactory;

import abstractFactory.AbstractFactory;
import abstractFactory.Colaborator;
import abstractFactory.TraineeFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ColaboratorTest {

    @Test
    void shouldReturnTraineeContract() {
        AbstractFactory factory = new TraineeFactory();
        Colaborator colaborator = new Colaborator(factory);
        assertEquals("trainee convenant", colaborator.printConvenant());
    }

    @Test
    void shoudReturnTreineeProfits() {
        AbstractFactory factory = new TraineeFactory();
        Colaborator colaborator = new Colaborator(factory);
        assertEquals("trainee profit", colaborator.printProfit());
    }
}
