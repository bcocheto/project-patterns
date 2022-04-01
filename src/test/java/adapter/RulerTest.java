package adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RulerTest {

    @Test
    void shouldReturnFeetRuler() {
        Ruler ruler = new Ruler();
        ruler.setMeasure(1f);

        assertEquals(1f, ruler.getMeasure());
    }

    @Test
    void shouldReturnDefaultRuler() {
        Ruler ruler = new Ruler();
        ruler.setMeasure(1f);

        assertEquals(31.249998092651367f, ruler.getDefaultMeasure());
    }

}