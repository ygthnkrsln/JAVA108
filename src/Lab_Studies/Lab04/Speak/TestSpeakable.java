package Lab_Studies.Lab04.Speak;

public class TestSpeakable {
    public static void main(String[] args) {
        Speakable cat = new Cat();
        Speakable cow = new Cow();

        Animal cat2 = new Cat();
        Animal cow2 = new Cow();

        System.out.println(cat.speak());
//        System.out.println(cat2.speak());
        System.out.println(cow.speak());
//        System.out.println(cow2.speak());
    }
}
