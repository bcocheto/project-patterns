package mediator;

public class Character {

    public String PublishUpdate(String message) {
        return Village.getInstance().publishUpdateInBoard(message);
    }

    public String PublishQuest(String message) {
        return  Village.getInstance().publicarQuestQuadroPrincipal(message);
    }
}
