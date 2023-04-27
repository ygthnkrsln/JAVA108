package Lab_Studies.Lab04.Speak;

public class Cow extends Animal implements Speakable {
    public Cow() {
        kind = "Cow";
    }

    public String speak() {
        return "moo";
    }
}
