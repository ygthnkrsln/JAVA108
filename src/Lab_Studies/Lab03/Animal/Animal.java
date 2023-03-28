package Lab_Studies.Lab03.Animal;

public abstract class Animal {
    protected String type;

    public Animal() {}

    public String toString() {
        return "I am a " + type + " and I go " + speak();
    }

    public abstract String speak();
}
