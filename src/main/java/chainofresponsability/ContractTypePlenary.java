package chainofresponsability;

public class ContractTypePlenary implements TypeContract {

    private static final ContractTypePlenary typePlenary = new ContractTypePlenary();

    private ContractTypePlenary() {}

    public static ContractTypePlenary getTypePlenary() {
        return typePlenary;
    }
}
