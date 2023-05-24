package Assignments.A03;

import java.awt.geom.Point2D;
import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class FindClosestPointPair {

    Point2D.Double[] points; // Points set: SmallerSet.input, test_100.input, test_1000.input, test_10000.input
    private Point2D.Double point_1, point_2; // closest point pair

    /**
     * Default Constructor
     */
    public FindClosestPointPair() {
    }

    /**
     * Main method for calculate and return closest point pair
     */
    public void calculateClosestPointPair() {
        double min = Double.MAX_VALUE;

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length ; j++) {
                double distance = getDistance(points[i], points[j]);
                if (distance < min) {
                    min = distance;
                    this.point_1 = points[i];
                    this.point_2 = points[j];
                }
            }
        }
    }

    /**
     *
     * @param filePath --> file absolute path
     * @return --> array containing the information of points read from the file
     * @throws Exception
     */
    public void readFile(String filePath) throws Exception{
        File file = new File(filePath);
        Scanner input = new Scanner(file);
        input.useLocale(Locale.ENGLISH);

        int n = input.nextInt();
        points = new Point2D.Double[n];

        for (int i = 0; i < n; i++) {
            double x = input.nextDouble();
            double y = input.nextDouble();
            points[i] = new Point2D.Double(x, y);
        }

        input.close();
    }

    /**
     * Get point_1
     */
    public Point2D.Double getPoint_1(){ return point_1;}

    /**
     * Get point_2
     */
    public Point2D.Double getPoint_2(){ return point_2;}

    /**
     * Get Point Pair distance
     */
    public double getDistance(Point2D.Double p1, Point2D.Double p2) {
        return Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2));
    }

    /** Returns a printable representation of this pair and the distance */
    public String toString() {
        if (this.point_1.x > this.point_2.x || this.point_1.x == this.point_2.x && this.point_1.y > this.point_2.y) {
            Point2D.Double temp = this.point_1;
            this.point_1 = this.point_2;
            this.point_2 = temp;
        }
        return "(" + this.point_1.x + ", " + this.point_1.y + ")-(" + this.point_2.x + ", " + this.point_2.y + ")= " + getDistance(this.point_1,this.point_2);
    }

}