package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Guild {

    private final List<Character> characters = new ArrayList<>();

    public void Hire(String characterName, String className, String region) {
        Class aClass = ClassFactory.getClass(className, region);
        Character character = new Character(characterName, aClass);
        characters.add(character);
    }

    public List<String> getCharacterName() {
        List<String> exit = new ArrayList<>();
        for (Character character : this.characters) {
            exit.add(character.obterPersonagem());
        }
        return exit;
    }
}
