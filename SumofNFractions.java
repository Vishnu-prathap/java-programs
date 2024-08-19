
import java.util.Arrays;
import java.util.Scanner;

public class SumofNFractions {

    public static final Scanner sc = new Scanner(System.in);

    public static int InputSize() {
        System.out.println("Enter the number of fractions to be added: ");
        int size = sc.nextInt();
        return size;
    }

    public static int[] InputFraction() {
        int[] fractionArr = new int[2];

        System.out.println("Enter the numerator: ");
        int numerator = sc.nextInt();

        System.out.println("Enter the denominator: ");
        int denominator = sc.nextInt();

        if (denominator == 0) {
            System.out.println("Denominator cannot be zero. Please enter a valid denominator.");
            return null;
        }

        fractionArr[0] = numerator;
        fractionArr[1] = denominator;
        return fractionArr;
    }

    public static void main(String[] args) {
        // Input function to choose the number of fractions
        int inputSize = InputSize();
        int[][] fractionArray = new int[inputSize][2];
        // Input the fractions and append to one one array
        for (int i = 0; i < inputSize; i++) {
            int[] fraction = InputFraction();

            // If fraction is null (invalid), ask for input again
            while (fraction == null) {
                System.out.println("Invalid fraction. Please re-enter the fraction.");
                fraction = InputFraction();
            }

            fractionArray[i] = fraction;
        }
        System.out.println(Arrays.deepToString(fractionArray));
        // Find sum of the fractions and output
    }
}
