package decorator;

public class Nutmeg extends CoffeDecorator {

    public Nutmeg(Coffe coffe) {
        super(coffe);
    }

    public double getFlavoringPrice() {
        return 0.80;
    }

    public String getFlavoringName() {
        return "nutmeg";
    }
}
