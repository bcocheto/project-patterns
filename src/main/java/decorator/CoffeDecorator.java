package decorator;

public abstract class CoffeDecorator implements Coffe {

    private Coffe coffe;
    public String description;

    public CoffeDecorator(Coffe coffe) {
        this.coffe = coffe;
    }

    public Coffe getCoffe() {
        return coffe;
    }

    public void setCoffe(Coffe coffe) {
        this.coffe = coffe;
    }

    public abstract double getFlavoringPrice();

    public Double getPrice() {
        return this.coffe.getPrice() + this.getFlavoringPrice();
    }

    public abstract String getFlavoringName();

    public String getDescription() {
        return this.coffe.getDescription() + " " + "+" + " " + this.getFlavoringName();
    }
}
