package abstractFactory;

public class Colaborator {

    private Convenant convenant;
    private Profit profit;

    public Colaborator(AbstractFactory factory) {
        this.convenant = factory.createConvenant();
        this.profit = factory.createProfit();
    }

    public String printConvenant() { return this.convenant.returnData(); }

    public String printProfit() { return this.profit.returnData(); }

}
