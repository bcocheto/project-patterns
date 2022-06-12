package mediator;

public class Village {

    private static final Village instance = new Village();

    private Village() {}

    public static Village getInstance() {return instance;}

    public String publishUpdateInBoard(String message) {
        return PrincipalBoard.getInstance().publishUpdate(message);
    }

    public String publicarQuestQuadroPrincipal(String message) {
        return PrincipalBoard.getInstance().publishQuest(message);
    }
}
