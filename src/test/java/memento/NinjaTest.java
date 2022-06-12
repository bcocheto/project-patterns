package memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NinjaTest {

    @Test
    void shouldSaveJutsus() {
        Ninja ninja = new Ninja();
        ninja.setJutsu(Hokage.getInstance());
        ninja.setJutsu(DotonJutsu.getInstance());

        assertEquals(2, ninja.getJutsus().size());
    }

    @Test
    void shouldReturnFirstJutsu() {
        Ninja ninja = new Ninja();
        ninja.setJutsu(Hokage.getInstance());
        ninja.setJutsu(DotonJutsu.getInstance());
        ninja.restoreJutsus(0);

        assertEquals(Hokage.getInstance(), ninja.getJutsu());
    }

    @Test
    void shouldReturnExceptionInvalidIndex() {
        try {
            Ninja ninja = new Ninja();
           ninja.restoreJutsus(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("invalid index", e.getMessage());
        }
    }



}