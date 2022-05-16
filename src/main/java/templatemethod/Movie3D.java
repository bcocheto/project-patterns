package templatemethod;

public class Movie3D extends Movie {

    @Override
    public String getCategory() {
        return "3DMovie";
    }

    @Override
    public float calculateValue() {
        return this.getPartialValue()+3.5f;
    }
}
