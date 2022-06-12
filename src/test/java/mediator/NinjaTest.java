package mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NinjaTest {


    @Test
    void shouldPublishUpdate() {
        Ninja ninja = new Ninja();
        assertEquals("Update", ninja.PublishUpdate("Update"));
    }

    @Test
    void shouldPublishQuest() {
        Ninja ninja = new Ninja();
        assertEquals("Quest", ninja.PublishQuest("Quest"));
    }
}