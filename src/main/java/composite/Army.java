package composite;

public class Army {

    private Grouping navy;

    public void setNavy(Grouping navy) {
        this.navy = navy;
    }

    public String getNavy() {
        if (this.navy == null) {
            throw new NullPointerException("army not found");
        }
        return this.navy.getGrouping();
    }
}