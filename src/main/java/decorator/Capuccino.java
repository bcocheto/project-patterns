package decorator;

public class Capuccino implements Coffe {

    public Double price;

    public Capuccino() {
    }

    public Capuccino(Double price) {
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "capuccino";
    }
}
