package composite;

public abstract class Grouping {

    private String description;

    public Grouping(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract String getGrouping();
}
