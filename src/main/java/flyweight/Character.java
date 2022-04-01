package flyweight;

public class Character {

    private final String name;
    private final Class aClass;

    public Character(String name, Class aClass) {
        this.name = name;
        this.aClass = aClass;
    }

    public String obterPersonagem() {
        return "Character {" +
                "name='" + this.name + '\'' +
                ", class='" + aClass.getName() + '\'' +
                ", region='" + aClass.getRegion() + '\'' +
                '}';
    }
}
