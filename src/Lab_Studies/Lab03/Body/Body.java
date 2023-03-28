package Lab_Studies.Lab03.Body;

public abstract class Body {
    private double density = 1.0;

    protected Body(double d) {
        density = d;
    }

    public double getDensity() {
        return density;
    }

    public double getMass() {
        return density*getVolume();
    }

    abstract public double getVolume();
}
