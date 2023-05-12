package Lecture_Studies.Chapter13;

public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject geometricObject1 = new Circle(5);
        GeometricObject geometricObject2 = new Rectangle(5, 3);
        System.out.println("The two objects have the same area? " + equalArea(geometricObject1, geometricObject2));

        displayGeometricObject(geometricObject2);
        displayGeometricObject(geometricObject1);
    }

    public static boolean equalArea(GeometricObject object1, GeometricObject object2) {
        return object1.getArea() == object2.getArea();
    }

    public static void displayGeometricObject(GeometricObject object) {
        System.out.println();
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }
}
