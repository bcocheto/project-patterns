package mediator;


public class PrincipalBoard implements Board {

    private static final PrincipalBoard instance = new PrincipalBoard();

    private PrincipalBoard() {}

    public static PrincipalBoard getInstance() {return instance;}

    public String publishUpdate(String message) {
        return message;
    }
    public String publishQuest(String message) {
        return message;
    }
}
