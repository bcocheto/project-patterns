package command;

public class QuestBook {

    private String situation;

    public QuestBook(String village) {
    }

    public String getSituation() {
        return situation;
    }

    public void openBook() {
        this.situation = "QuestBook opened";
    }

    public void closeBook() {
        this.situation = "QuestBook closed";
    }
}
