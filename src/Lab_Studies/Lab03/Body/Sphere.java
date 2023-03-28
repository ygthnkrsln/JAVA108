package Lab_Studies.Lab03.Body;

public class Sphere extends Body{
    private double radius = 1.0;

    public Sphere(double d, double r) {
        super(d);
        radius = r;
    }

    public double getVolume() {
        return ((Math.PI * Math.pow(radius, 3)) / 3);
    }
}
