package builder;

public class Computer {

    private String motherBoard;
    private String source;
    private String processor;
    private String ramMemory;
    private String hd;
    private String videoBoard;

    public Computer() {
        this.motherBoard = "";
        this.source = "";
        this.processor = "";
        this.ramMemory = "";
        this.hd = "";
        this.videoBoard = "";
    }

    public String getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(String ramMemory) {
        this.ramMemory = ramMemory;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public String getVideoBoard() {
        return videoBoard;
    }

    public void setVideoBoard(String videoBoard) {
        this.videoBoard = videoBoard;
    }
}
