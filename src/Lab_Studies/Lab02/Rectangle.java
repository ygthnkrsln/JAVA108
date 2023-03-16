package Lab_Studies.Lab02;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean isFilled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(isFilled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public void printRectangle() {
        System.out.println("The rectangle is created at " + getDateCreated() +
                "\nIts width is: " + getWidth() +
                "\nIts height is: " + getHeight() +
                "\nIts color is: " + getColor() +
                "\nIs it filled: " + isFilled() +
                "\nIts perimeter is: " + getPerimeter() +
                "\nIts area is: " + getArea());
    }
}
