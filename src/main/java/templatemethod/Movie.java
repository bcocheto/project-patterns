package templatemethod;

public abstract class Movie {
    //valores diferentes para filmes normais e 3d
    private String name;
    private String schedule;
    private String room;
    private float partialValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public float getPartialValue() {
        return partialValue;
    }

    public void setPartialValue(float partialValue) {
        this.partialValue = partialValue;
    }

    public abstract float calculateValue();

    public String getCategory() {
        return "Movie";
    }

    public String getInfo() {
        return getCategory() + "{" +
                "name='" + this.name + '\'' +
                ", schedule=" + this.getSchedule() + '\'' +
                ", value=" + this.calculateValue() +
                '}';
    }
}
