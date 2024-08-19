
import java.util.Arrays;
import java.util.Scanner;

public class DistanceBetweenTwoPointsUsingArray {

    public static Scanner sc = new Scanner(System.in);

    // This function can also be written using map function
    public static double[] InputPoint(String inputValues) {
        double[] arr = new double[2];
        System.out.println("Enter the values of " + inputValues);
        for (int i = 0; i < 2; i++) {
            arr[i] = sc.nextDouble();
        }
        return arr;
    }

    public static double CalculateDistance(double[] point1, double[] point2) {
        return Math.sqrt(Math.pow(point1[0] - point2[0], 2) + Math.pow(point1[1] - point2[1], 2));
    }

    public static void OutputDistance(double distance, double[] arr1, double[] arr2) {
        System.out.println("The distance between the points (x1,y1)" + Arrays.toString(arr1) + "and (x2,y2)" + Arrays.toString(arr2) + "is: " + distance);
    }

    public static void main(String[] args) {
        // input values into an array

        double[] point1 = InputPoint("x1,y1");
        double[] point2 = InputPoint("x2,y2");

        // // calculate distance
        // double[] arr1 = points[0];
        // double[] arr2 = points[1];
        // double distance = CalculateDistance(arr1, arr2);
        // // output distance value
        // OutputDistance(distance, arr1, arr2);
    }
}
