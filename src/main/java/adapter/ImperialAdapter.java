package adapter;

public class ImperialAdapter extends DefaultMeasure {

    private final IMeasure feetMeasure;

    public ImperialAdapter(IMeasure FeetMeasure) {
        this.feetMeasure = FeetMeasure;
    }

    public float getImperialMeasure() {
        feetMeasure.setMeasure(this.getDefaultMeasure() * 0.032f);
        return feetMeasure.getMeasure();

    }

    public void setDefaultMeasure() {
        this.setDefaultMeasure(feetMeasure.getMeasure() / 0.032f);
    }
}
