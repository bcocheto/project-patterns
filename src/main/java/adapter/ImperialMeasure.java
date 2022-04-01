package adapter;

public class ImperialMeasure implements IMeasure {

    private float feet;

    @Override
    public float getMeasure() {
        return this.feet;
    }

    @Override
    public  void setMeasure(float feet) {
        this.feet = feet;
    }

}
