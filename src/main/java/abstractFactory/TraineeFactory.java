package abstractFactory;

public class TraineeFactory implements AbstractFactory {

    @Override
    public Convenant createConvenant() {
        return new ConvenantTrainee();
    }

    @Override
    public Profit createProfit() {
        return (Profit) new TraineeProfit();
    }

}
