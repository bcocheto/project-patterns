package bridge;

public abstract class Character {

    protected Class aClass;

    protected float baseHealt;

    public Character(float baseHealt) {
        this.baseHealt = baseHealt;
    }

    public void setClass(Class aClass) {
        this.aClass = aClass;
    }

    public void setBaseHealt(float baseHealt) {
        this.baseHealt = baseHealt;
    }

    public abstract float calculateHealth();
}
