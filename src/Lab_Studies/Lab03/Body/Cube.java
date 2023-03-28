package Lab_Studies.Lab03.Body;

public class Cube extends Body{
    private double side = 1.0;

    public Cube(double d, double e) {
        super(d);
        side = e;
    }

    public double getVolume() {
        return Math.pow(side, 3);
    }
}
