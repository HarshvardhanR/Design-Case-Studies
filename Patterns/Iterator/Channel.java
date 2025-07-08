package Iterator;

public class Channel {
    private double frequency;
    private String name;

    public Channel(double frequency, String name) {
        this.frequency = frequency;
        this.name = name;
    }

    public String toString() {
        return name + " - " + frequency + " MHz";
    }
}
