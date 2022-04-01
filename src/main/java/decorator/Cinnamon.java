package decorator;

public class Cinnamon extends CoffeDecorator {

    public Cinnamon(Coffe coffe) {
        super(coffe);
    }

    public double getFlavoringPrice() {
        return 0.50;
    }

    public String getFlavoringName() {
        return "cinnamon";
    }
}
