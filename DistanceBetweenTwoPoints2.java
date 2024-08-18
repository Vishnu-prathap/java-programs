
import java.util.Scanner;

public class DistanceBetweenTwoPoints2 {
    public static double[][] InputPoints(String inputValues) {
        double[] arr1 = new double[2];
        double[] arr2 = new double[2];
        String[] parts = inputValues.split(",");
        
        try {
            arr1[0] = Double.parseDouble(parts[0].trim());
            arr1[1] = Double.parseDouble(parts[1].trim());
            arr2[0] = Double.parseDouble(parts[2].trim());
            arr2[1] = Double.parseDouble(parts[3].trim());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("All input values need to be valid numbers.");
        }

        // Return a 2D array containing arr1 and arr2
        return new double[][]{arr1, arr2};
    }
    public static void main(String[] args){
        // input values into an array
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the coordinates for the points (format:x1,y1,x2,y2)");
       String input1 = sc.nextLine();
       double[][] points = InputPoints(input1);

        // calculate distance
        // output distance value
    }
}
