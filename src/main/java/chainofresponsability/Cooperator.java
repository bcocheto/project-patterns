package chainofresponsability;

import java.util.ArrayList;

public abstract class Cooperator {

    protected ArrayList contractList = new ArrayList();
    private Cooperator contributorDegree;

    public Cooperator getDegree() {
        return contributorDegree;
    }

    public void setDegree(Cooperator contributorDegree) {
        this.contributorDegree = contributorDegree;
    }

    public abstract String getRoleDescription();

    public String signContract(Contract contract) {
        if (contractList.contains(contract.getContractType())) {
            return getRoleDescription();
        }
        else {
            if (contributorDegree != null) {
                return contributorDegree.signContract(contract);
            }
            else
            {
                return "No signature";
            }
        }
    }
}
