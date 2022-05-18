package command;

public class CloseBook implements Quest{

    private final QuestBook questBook;

    public CloseBook(QuestBook questBook) {
        this.questBook = questBook;
    }

    public void execute() {
        this.questBook.closeBook();
    }

    public void cancel() {
        this.questBook.openBook();
    }
}
