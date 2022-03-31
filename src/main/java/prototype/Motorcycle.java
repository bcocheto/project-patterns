package prototype;

public class Motorcycle implements Cloneable{
    private String plate;
    private Model model;

    public Motorcycle(String plate, Model model) {
        this.plate = plate;
        this.model = model;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public Motorcycle clone() throws CloneNotSupportedException{
        Motorcycle motorcycleClone = (Motorcycle) super.clone();
        motorcycleClone.model = (Model) motorcycleClone.model.clone();
        return motorcycleClone;
    }

    @Override
    public  String toString() {
        return "Motorcycle{"+
                "plate="+ plate +
                ", model="+ model + '\'' +
                "}";

    }
}
