package composite;

import java.util.ArrayList;
import java.util.List;

public class Division extends Grouping {

    private final List<Grouping> groupings;

    public Division(String description) {
        super(description);
        this.groupings = new ArrayList<>();
    }

    public void addGrouping(Grouping grouping) {
        this.groupings.add(grouping);
    }

    public String getGrouping() {
        StringBuilder exit;
        exit = new StringBuilder("Division: " + this.getDescription() + "\n");
        for (Grouping grouping : groupings) {
            exit.append(grouping.getGrouping());
        }
        return exit.toString();
    }
}
