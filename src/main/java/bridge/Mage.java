package bridge;

public class Mage extends Character {

    public Mage(float baseHealth) {
        super(baseHealth);
    }

    public float calculateHealth() {
        return this.baseHealt * (1 + this.aClass.upPercent());
    }
}
