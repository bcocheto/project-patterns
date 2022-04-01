package composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmyTest {

    @Test
    void shouldReturnGrouping() {
        Division division1 = new Division("division 1A");
        Brigade brigade1 = new Brigade("Brigade 01 of division 1", 900);
        division1.addGrouping(brigade1);

        Division division2 = new Division("division 2A");
        Brigade brigade5 = new Brigade("Brigade 05 of division 2A", 500);
        Brigade brigade7 = new Brigade("Brigade 07 of division 2A", 850);
        division2.addGrouping(brigade5);
        division2.addGrouping(brigade7);

        Division division3 = new Division("Division 1B");

        Division navy = new Division("Navy Seals");
        navy.addGrouping(division1);
        navy.addGrouping(division2);
        navy.addGrouping(division3);

        Army army = new Army();
        army.setNavy(navy);

        assertEquals("Division: Navy Seals\n" +
                "Division: division 1A\n" +
                "Brigade: Brigade 01 of division 1 - Quantity of units: 900\n" +
                "Division: division 2A\n"+
                "Brigade: Brigade 05 of division 2A - Quantity of units: 500\n"+
                "Brigade: Brigade 07 of division 2A - Quantity of units: 850\n"+
                "Division: Division 1B\n", army.getNavy());
    }

    @Test
    void shouldReturnExceptionWithowtNavy() {
        try {
            Army army = new Army();
            army.getNavy();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("army not found", e.getMessage());
        }
    }
}