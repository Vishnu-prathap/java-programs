
import java.util.Arrays;
import java.util.Scanner;

public class SumofNIntegers {

    private static final Scanner sc = new Scanner(System.in);

    public static int NumberOfIntegers() {

        System.out.println("Enter the number of values to sum: ");
        int arrayLength = sc.nextInt();
        return arrayLength;

    }

    public static double[] InputSumValues(int arraySize) {
        double[] values = new double[arraySize];

        for (int i = 0; i < arraySize; i++) {
            values[i] = sc.nextDouble();
        }
        return values;

    }

    public static void OutputSum(int arraySize, double[] inputvalues) {

        System.out.println("The sum of the user input " + Arrays.toString(inputvalues) + " is: " + Arrays.stream(inputvalues).sum());
    }

    public static void main(String[] args) {
        // Input the number of values
        int arraySize = NumberOfIntegers();
        // Input the values
        double[] inputValues = InputSumValues(arraySize);
        // System.out.println("Values"+Arrays.toString(inputValues));
        // calculate sum of the entered values and print
        OutputSum(arraySize, inputValues);
    }
}
