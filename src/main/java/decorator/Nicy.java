package decorator;

public class Nicy extends CoffeDecorator {

    public Nicy(Coffe coffe) {
        super(coffe);
    }

    public double getFlavoringPrice() {
        return 0.70;
    }

    public String getFlavoringName() {
        return "nicy";
    }
}
