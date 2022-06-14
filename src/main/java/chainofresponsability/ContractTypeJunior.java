package chainofresponsability;

public class ContractTypeJunior implements TypeContract {

    private static final ContractTypeJunior typeJunior = new ContractTypeJunior();

    private ContractTypeJunior() {}

    public static ContractTypeJunior getTypeJunior() {
        return typeJunior;
    }
}
