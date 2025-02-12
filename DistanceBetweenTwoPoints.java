
import java.util.Scanner;

public class DistanceBetweenTwoPoints {

    public static double  InputCoordinates(String coordinate) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the " + coordinate + " coordinate: ");
            double coordinateValue = sc.nextInt();
            return coordinateValue;
        }
    }

    public static double CalculateDistance(double x1, double x2, double y1, double y2) {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }
    public static void OutputDistance(double x1,double x2,double y1,double y2,double distanceValue){
        System.out.println("The distance between the input points is "+distanceValue);
    }
    public static void main(String[] args) {
        // Input value of x1x2 and y1y2
        // print-> enter first point
        double x1 = InputCoordinates("x1");
        double y1 = InputCoordinates("y1");
        // print-> enter second point
        double x2 = InputCoordinates("x2");
        double y2 = InputCoordinates("y2");
        // Calculate using distance formula
        double distanceValue = CalculateDistance(x1, x2, y1, y2);
        // System.out.println(distanceValue);
        // Output the calculated value
        OutputDistance(x1, x2, y1, y2, distanceValue);
    }
}
