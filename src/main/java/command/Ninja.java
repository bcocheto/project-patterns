package command;

import java.util.ArrayList;
import java.util.List;

public class Ninja {

    private final List<Quest> quests = new ArrayList<>();

    public void executeQuest(Quest quest) {
        this.quests.add(quest);
        quest.execute();
    }

    public void cancelQuest() {
        if(quests.size() != 0) {
            Quest quest = this.quests.get(this.quests.size() - 1);
            quest.cancel();
            this.quests.remove(this.quests.size() - 1);
        }
    }
}
