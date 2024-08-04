
import java.util.Scanner;

public class DistanceBetweenTwoPoints {

    public static int InputCoordinates(String coordinate) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the " + coordinate + " coordinate: ");
        int coordinateValue = sc.nextInt();
        return coordinateValue;
    }

    public static double DistanceCalculation(double x1, double x2, double y1, double y2) {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }
    public static void DistanceBetweenTwoPointsOutput(double x1,double x2,double y1,double y2,double distanceValue){
        System.out.println("The distance between the input points is "+distanceValue);
    }
    public static void main(String[] args) {
        // Input value of x1x2 and y1y2
        double x1 = InputCoordinates("x1");
        double x2 = InputCoordinates("x2");
        double y1 = InputCoordinates("y1");
        double y2 = InputCoordinates("y2");
        // Calculate using distance formula
        double distanceValue = DistanceCalculation(x1, x2, y1, y2);
        // System.out.println(distanceValue);
        // Output the calculated value
        DistanceBetweenTwoPointsOutput(x1, x2, y1, y2, distanceValue);
    }
}
