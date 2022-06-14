package chainofresponsability;

public class ProductMananger extends Cooperator {

    public ProductMananger(Cooperator degree) {
        contractList.add(ContractTypePlenary.getTypePlenary());
        setDegree(degree);
    }

    public String getRoleDescription() {
        return "Product Mananger";
    }
}
