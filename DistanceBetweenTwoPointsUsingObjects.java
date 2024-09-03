
import java.util.Dictionary;
import java.util.Hashtable;
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

    // public static double[] InputPoint(String inputCoordinate) {
    //     double[] arr = new double[2];
    //     System.out.print("Enter the points " + inputCoordinate + ": ");
    //     arr[0] = sc.nextDouble();
    //     arr[1] = sc.nextDouble();
    //     return arr;
    // }
    public static Point InputPoint(String inputCoordinate) {
        System.out.print("Enter the points " + inputCoordinate + ": ");
        double xCoordinate = sc.nextDouble();
        double yCoordinate = sc.nextDouble();
        Point pointCoordinate = new Point(xCoordinate, yCoordinate);
        return pointCoordinate;
    }

    // @SuppressWarnings("rawtypes")
    public static Dictionary InputDictionary(String inputCoordinates) {
        Dictionary<String, Double> dictionary = new Hashtable<>();
        String[] coordinateNames = inputCoordinates.split(inputCoordinates, ',');
        System.out.print("Enter the points " + inputCoordinates + ": ");
        dictionary.put(coordinateNames[0], sc.nextDouble());
        dictionary.put(coordinateNames[1], sc.nextDouble());
        return dictionary;
    }

    public static double CalculateDistance(Point point1, Point point2) {
        return Math.sqrt(Math.pow(point1.xCoordinate - point2.xCoordinate, 2) + Math.pow(point1.yCoordinate - point2.yCoordinate, 2));
    }

    public static void DisplayDistanceOutput(double distance, Point point1, Point point2) {
        System.out.println("The distance betweem points (x1,y1)" + point1.xCoordinate + point1.yCoordinate + " and (x2,y2)" + point2.xCoordinate + point2.yCoordinate + "is: " + distance);
    }

    public static void main(String[] args) {
        // double[] point1Values = InputPoint("X1,Y1");
        // double[] point2Values = InputPoint("X2,Y2");
        // // double pointy1 = InputPoint("Y1");
        // double pointx2 = InputPoint("X2");2 4
        // double pointy2 = InputPoint("Y2");
        // Dictionary point1Dictionary = InputDictionary("X1,Y1");
        // System.out.println(point1Dictionary);

        Point point1 = InputPoint("X1,Y1");
        System.out.println(point1.xCoordinate + " " + point1.yCoordinate);
        // Point point2 = new Point();
        // System.out.println(point2);
        // System.out.println("point1" + point1.xCoordinate + point1.yCoordinate);
        // Point point2 = new Point(pointx2, pointy2);
        // double distance = CalculateDistance(point1, point2);
        // DisplayDistanceOutput(distance, point1, point2);
        // System.out.println("Distance" + CalculateDistanceObject(point1, point2));
    }
}
