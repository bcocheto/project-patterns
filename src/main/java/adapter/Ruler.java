package adapter;

public class Ruler {

    IMeasure measure;
    ImperialAdapter measurement;

    public Ruler() {
        measure = new ImperialMeasure();
        measurement = new ImperialAdapter(measure);
    }

    public void setMeasure(float value) {
        measure.setMeasure(value);
        measurement.setDefaultMeasure();
    }

    public float getMeasure() {
        return measurement.getImperialMeasure();
    }

    public float getDefaultMeasure() {
        return measurement.getDefaultMeasure();
    }
}
