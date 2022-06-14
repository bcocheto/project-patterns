package chainofresponsability;

public class ImplantationContribuitor extends Cooperator {

    public ImplantationContribuitor(Cooperator degree) {
        contractList.add(ContractTypeJunior.getTypeJunior());
        setDegree(degree);
    }

    public String getRoleDescription() {
        return "Implantation";
    }

}
