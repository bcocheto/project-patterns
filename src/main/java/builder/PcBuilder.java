package builder;

public class PcBuilder {

    private final Computer computer;

    public PcBuilder() {
        computer = new Computer();
    }

    public Computer build() {
        if (computer.getSource().equals("")) {
            throw new IllegalArgumentException("this pc needs a source.");
        }
        if (computer.getMotherBoard().equals("")) {
            throw new IllegalArgumentException("this pc needs a motherboard.");
        }
        if (computer.getRamMemory().equals("")) {
            throw new IllegalArgumentException("this pc needs a ram memory.");
        }
        if (computer.getHd().equals("")) {
            throw new IllegalArgumentException("this pc needs a hd.");
        }
        if (computer.getProcessor().equals("")) {
            throw new IllegalArgumentException("this pc needs a processor.");
        }
        return computer;
    }

    public PcBuilder setSource(String source) {
        computer.setSource(source);
        return this;
    }

    public PcBuilder setMotherBoard(String motherBoard) {
        computer.setMotherBoard(motherBoard);
        return this;
    }

    public PcBuilder setProcessor(String processor) {
        computer.setProcessor(processor);
        return this;
    }

    public PcBuilder setRamMemory(String ramMemory) {
        computer.setRamMemory(ramMemory);
        return this;
    }

    public PcBuilder setHd(String hd) {
        computer.setHd(hd);
        return this;
    }

    public PcBuilder setVideoBoard(String videoBoard) {
        computer.setVideoBoard(videoBoard);
        return this;
    }
}
