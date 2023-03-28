package Lab_Studies.Lab03.Body;

public class BodyTest {
    public static void main(String[] args) {
        Sphere s = new Sphere(1, 3);
        Cube c = new Cube(1, 3);

        System.out.println("Mass of the sphere : " + s.getMass());
        System.out.println("Mass of the cube : " + c.getMass());
    }
}
