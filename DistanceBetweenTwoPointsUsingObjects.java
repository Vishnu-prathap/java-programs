
import java.util.Scanner;

class Point {

    // Attributes of the point
    double xCoordinate;
    double yCoordinate;

    // Constructer to initialize the Point Object
    public Point(double yCoordinate, double xCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;

    }

    // Multiple method to do operations
    public double CalculateDistance(double pointx1, double pointy1, double pointx2, double pointy2) {
        return Math.sqrt(Math.pow(pointx1 - pointx2, 2) + Math.pow(pointy1 - pointy2, 2));
    }

    public void DisplayDistanceOutput(double distance, double pointx1, double pointy1, double pointx2, double pointy2) {
        System.out.println("The distance between x1,y1 (" + pointx1 + "," + pointy1 + ") and x2,y2 (" + pointx2 + "," + pointy2 + ") is: " + distance);
    }
}

public class DistanceBetweenTwoPointsUsingObjects {

    public static Scanner sc = new Scanner(System.in);

    public static double InputPoint(String inputCoordinate) {
        System.out.print("Enter the point " + inputCoordinate + ": ");
        double point = sc.nextDouble();
        return point;
    }

    public static void main(String[] args) {
        double pointx1 = InputPoint("X1");
        double pointy1 = InputPoint("Y1");
        double pointx2 = InputPoint("X2");
        double pointy2 = InputPoint("Y2");

        Point point = new Point(pointx1, pointy1, pointx2, pointy2);
        double distance = point.CalculateDistance(pointx1, pointy1, pointx2, pointy2);
        point.DisplayDistanceOutput(distance, pointx1, pointy1, pointx2, pointy2);

    }
}
