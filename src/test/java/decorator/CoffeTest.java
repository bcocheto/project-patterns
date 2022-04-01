package decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeTest {

    @Test
    void shouldReturnCoffePrice() {
        Coffe coffe = new Capuccino(2.50);

        assertEquals(2.50, coffe.getPrice());
    }

    @Test
    void shouldReturnWithCinnamonPrice() {
        Coffe coffe = new Cinnamon(new Capuccino(2.50));

        assertEquals(3.00, coffe.getPrice());
    }

    @Test
    void shouldReturnWithNutmegPrice() {
        Coffe coffe = new Nutmeg(new Capuccino(2.50));

        assertEquals(3.30, coffe.getPrice());
    }

    @Test
    void shouldReturnWithNicyAndCapuccinoPrice() {
        Coffe coffe = new Nicy(new Capuccino(2.50));

        assertEquals(3.20, coffe.getPrice());
    }

    @Test
    void shouldReturnWithCinnamonAndNutmegAndCappucinoPrice() {
        Coffe coffe = new Cinnamon(new Nutmeg(new Capuccino(2.50)));

        assertEquals(3.80, coffe.getPrice());
    }

    @Test
    void shouldReturnWithCinnamonAndNicyPrice() {
        Coffe coffe = new Cinnamon(new Nicy(new Capuccino(2.50)));

        assertEquals(3.70, coffe.getPrice());
    }

    @Test
    void shouldReturnWithNutmegAndNicyAndCapuccinoPrice() {
        Coffe coffe = new Nutmeg(new Nicy(new Capuccino(2.50)));

        assertEquals(4.0, coffe.getPrice());
    }

    @Test
    void shouldReturnWithCinnamonAndNutmegAndNivyAndCapuccinoPrice() {
        Coffe coffe = new Cinnamon(new Nutmeg(new Nicy(new Capuccino(2.50))));

        assertEquals(4.50, coffe.getPrice());
    }

    @Test
    void shouldReturnDescription() {
        Coffe coffe = new Capuccino();

        assertEquals("capuccino", coffe.getDescription());
    }

    @Test
    void shouldReturnDescriptionWithCinnamon() {
        Coffe coffe = new Cinnamon(new Capuccino());

        assertEquals("capuccino + cinnamon", coffe.getDescription());
    }

    @Test
    void shouldReturnDescriptionWithNutmeg() {
        Coffe coffe = new Nutmeg(new Capuccino());

        assertEquals("capuccino + nutmeg", coffe.getDescription());
    }

    @Test
    void shouldReturnDescriptionWithNicy() {
        Coffe coffe = new Nicy(new Capuccino());

        assertEquals("capuccino + nicy", coffe.getDescription());
    }

    @Test
    void shouldReturnDescriptionWithCinnamonAndNutmeg() {
        Coffe coffe = new Cinnamon(new Nutmeg(new Capuccino()));

        assertEquals("capuccino + nutmeg + cinnamon", coffe.getDescription());
    }

    @Test
    void shouldReturnDescriptionWithCinnamonAndNicy() {
        Coffe coffe = new Cinnamon(new Nicy(new Capuccino()));

        assertEquals("capuccino + nicy + cinnamon", coffe.getDescription());
    }

    @Test
    void shouldReturnDescriptionWithNutmegAndNicy() {
        Coffe coffe = new Nutmeg(new Nicy(new Capuccino()));

        assertEquals("capuccino + nicy + nutmeg", coffe.getDescription());
    }

    @Test
    void shouldReturnDescriptionWithCinnamonAndNutmegAndNicy() {
        Coffe coffe = new Cinnamon(new Nutmeg(new Nicy(new Capuccino())));

        assertEquals("capuccino + nicy + nutmeg + cinnamon", coffe.getDescription());
    }
}