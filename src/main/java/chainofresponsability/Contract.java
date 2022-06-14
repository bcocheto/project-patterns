package chainofresponsability;

public class Contract {

    private TypeContract typeContract;

    public Contract(TypeContract typeContract) {
        this.typeContract = typeContract;
    }

    public TypeContract getContractType() {
        return typeContract;
    }

    public void setContractType(TypeContract typeContract) {
        this.typeContract = typeContract;
    }
}
