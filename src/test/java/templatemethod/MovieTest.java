package templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {
    @Test
    void shouldReturnTotalValue() {
        Movie3D movie = new Movie3D();
        movie.setPartialValue(12.0f);

        assertEquals(15.5f, movie.calculateValue());
    }

    @Test
    void shouldReturnInfo() {
        Movie3D movie = new Movie3D();
        movie.setPartialValue(10.0f);
        movie.setName("The Hobbit");
        movie.setSchedule("22");
        movie.setRoom("1");

        assertEquals("3DMovie{name='The Hobbit', schedule=22', value=13.5}", movie.getInfo());
    }
}