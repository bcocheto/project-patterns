package bridge;

public class Warrior extends Character {

    public Warrior(float baseHealth) {
        super(baseHealth);
    }

    public float calculateHealth() {
        return this.baseHealt * (1 + this.aClass.upPercent());
    }
}
