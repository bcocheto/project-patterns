package strategy;

public class Spell {

    private final String mode;

    public Spell(String mode) {
        this.mode = mode;
    }

    public String use(Skill skill) {
        return skill.use(mode);
    }
}
