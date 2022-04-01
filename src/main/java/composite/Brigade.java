package composite;

public class Brigade extends Grouping {

    private int militaryCount;

    public Brigade(String descricao, int militaryCount) {
        super(descricao);
        this.militaryCount = militaryCount;
    }

    public int getMilitaryCount() {
        return this.militaryCount;
    }

    public void setMilitaryCount(int militaryCount) {
        this.militaryCount = militaryCount;
    }

    public String getGrouping() {
        return "Brigade: " + this.getDescription() + " - Quantity of units: " + this.militaryCount + "\n";
    }
}
