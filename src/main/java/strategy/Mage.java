package strategy;

public class Mage {

    private String usedSkill;

    public String getUsedSkill() {
        return usedSkill;
    }

    public void fireSpell(String mode) {
        Spell spell = new Spell(mode);
        this.usedSkill = spell.use(new FireSpell());
    }

    public void iceSpell(String mode) {
        Spell spell = new Spell(mode);
        this.usedSkill = spell.use(new IceSpell());
    }


}
