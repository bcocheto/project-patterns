package templatemethod;

public class DefaultMovie extends Movie {

    public float calculateValue() {
        return this.getPartialValue();
    }
}
