package Lab_Studies.Lab02;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean isFilled) {
        this.radius = radius;
        setColor(color);
        setFilled(isFilled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public void printCircle() {
        System.out.println("The circle is created at " + getDateCreated() +
                "\nIts radius is: " + getRadius() +
                "\nIts color is: " + getColor() +
                "\nIs it filled: " + isFilled() +
                "\nIts perimeter is: " + getPerimeter() +
                "\nIts diameter is: " + getDiameter() +
                "\nIts area is: " + getArea());
    }
}
