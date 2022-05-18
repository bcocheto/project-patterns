package command;

public class OpenBook implements Quest{

    private final QuestBook questBook;

    public OpenBook(QuestBook questBook) {
        this.questBook = questBook;
    }

    public void execute() {
        this.questBook.openBook();
    }

    public void cancel() {
        this.questBook.closeBook();
    }
}
