package flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GuildTest {

    @Test
    void shouldreturnCharacters() {
        Guild guild = new Guild();
        guild.Hire("Sona", "Muda", "Demacia");
        guild.Hire("Yummi", "Gato", "Bandopolis");
        guild.Hire("Yasuo", "Lixo", "Ionia");
        guild.Hire("Rengar", "Gato", "Vastaya");

        List<String> exit = Arrays.asList(
                "Character {name='Sona', class='Muda', region='Demacia'}",
                "Character {name='Yummi', class='Gato', region='Bandopolis'}",
                "Character {name='Yasuo', class='Lixo', region='Ionia'}",
                "Character {name='Rengar', class='Gato', region='Bandopolis'}");

        assertEquals(exit, guild.getCharacterName());
    }

    @Test
    void shouldReturnClassCount() {
        Guild guild = new Guild();
        guild.Hire("Sona", "Muda", "Demacia");
        guild.Hire("Yummi", "Gato", "Bandopolis");
        guild.Hire("Yasuo", "Lixo", "Ionia");
        guild.Hire("Rengar", "Gato", "Vastaya");

        assertEquals(3, ClassFactory.getCountOfClasses());
    }

}