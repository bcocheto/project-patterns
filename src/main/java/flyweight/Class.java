package flyweight;

public class Class {

    public String name;
    public String region;

    public Class(String name, String region) {
        this.name = name;
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }
}
