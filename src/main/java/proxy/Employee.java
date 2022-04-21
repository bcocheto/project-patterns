package proxy;

public class Employee {

    private String name;
    private boolean doctor;

    public Employee(String name, boolean doctor) {
        this.name = name;
        this.doctor = doctor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDoctor() {
        return doctor;
    }

    public void setDoctor(boolean doctor) {
        this.doctor = doctor;
    }
}
