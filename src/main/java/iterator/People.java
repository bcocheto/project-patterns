package iterator;

public class People {

    private String name;
    private String address;
    private boolean owe;

    public People(String name, String address, boolean owe) {
        this.name = name;
        this.address = address;
        this.owe = owe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isOwe() {
        return owe;
    }

    public void setOwe(boolean owe) {
        this.owe = owe;
    }
}
