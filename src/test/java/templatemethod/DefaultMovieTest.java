package templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefaultMovieTest {

    @Test
    void shouldReturnTotalValue() {
        DefaultMovie defaultMovie = new DefaultMovie();
        defaultMovie.setPartialValue(10.0f);

        assertEquals(10.0f, defaultMovie.calculateValue());
    }

    @Test
    void shouldReturnInfo() {
        DefaultMovie defaultMovie = new DefaultMovie();
        defaultMovie.setPartialValue(10.0f);
        defaultMovie.setName("The Lord of Rings");
        defaultMovie.setSchedule("18");
        defaultMovie.setRoom("12");

        assertEquals("Movie{name='The Lord of Rings', schedule=18', value=10.0}", defaultMovie.getInfo());
    }
}