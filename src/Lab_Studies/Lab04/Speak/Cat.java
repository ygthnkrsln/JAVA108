package Lab_Studies.Lab04.Speak;

public class Cat extends Animal implements Speakable {
    public Cat() {
        kind = "Cat";
    }

    public String speak() {
        return "meow";
    }
}
