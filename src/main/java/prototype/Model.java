package prototype;

public class Model implements Cloneable{
    private String name;
    private String engine;

    public Model(String name, String engine) {
        super();
        this.name = name;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    @Override
    public String toString(){
        return "Model{" +
                "name=" + name +
                ", engine=" + engine + '\'' +
                "}";
    }
}