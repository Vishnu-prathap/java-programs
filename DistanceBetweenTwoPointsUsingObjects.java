
import java.util.Scanner;

class Point {

    // Attributes of the point
    double xCoordinate;
    double yCoordinate;
    // public static Scanner sc = new Scanner(System.in);
    // double[] pointValue;

    // Constructer to initialize the Point Object
    public Point(double xCoordinate, double yCoordinate) {
        // this.pointValue = pointValue;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;

    }
    // Multiple method to do operations

}

public class DistanceBetweenTwoPointsUsingObjects {

    public static Scanner sc = new Scanner(System.in);

    public static Point InputPoint(String inputCoordinate) {
        System.out.print("Enter the points " + inputCoordinate + ": ");
        double xCoordinate = sc.nextDouble();
        double yCoordinate = sc.nextDouble();
        Point point = new Point(xCoordinate, yCoordinate);
        return point;
    }

    public static double CalculateDistance(Point point1, Point point2) {
        return Math.sqrt(Math.pow(point1.xCoordinate - point2.xCoordinate, 2) + Math.pow(point1.yCoordinate - point2.yCoordinate, 2));
    }

    public static void DisplayDistanceOutput(double distance, Point point1, Point point2) {
        System.out.println("The distance betweem points (x1,y1)" + point1.xCoordinate + point1.yCoordinate + " and (x2,y2)" + point2.xCoordinate + point2.yCoordinate + "is: " + distance);
    }

    public static void main(String[] args) {

        Point point1 = InputPoint("X1,Y1");
        Point point2 = InputPoint("X2,Y2");
        // System.out.println(point1.xCoordinate + " " + point1.yCoordinate);
        double distance = CalculateDistance(point1, point2);
        DisplayDistanceOutput(distance, point1, point2);

    }
}
