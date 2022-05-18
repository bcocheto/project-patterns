package command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NinjaTest {

    Ninja ninja;
    QuestBook questBook;

    @BeforeEach
    void setUp() {
        ninja = new Ninja();
        questBook = new QuestBook("leaf");
    }

    @Test
    void shouldInitQuest() {
        Quest quest = new OpenBook(questBook);
        ninja.executeQuest(quest);

        assertEquals("QuestBook opened", questBook.getSituation());
    }

    @Test
    void shouldCancelQuest() {
        Quest quest = new CloseBook(questBook);
        ninja.executeQuest(quest);

        assertEquals("QuestBook closed", questBook.getSituation());
    }

}