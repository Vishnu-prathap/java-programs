
// import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FavouriteSinger {

    public static Scanner sc = new Scanner(System.in);

    public static int[] InputNumberOfSongs(int numberOfSingers) {
        int[] arr = new int[numberOfSingers];
        for (int i = 0; i <= numberOfSingers; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void Main(String args[]) {
        int numberOfSingers = sc.nextInt();
        int[] nfs = InputNumberOfSongs(numberOfSingers);
        System.out.println(Arrays.toString(nfs));
    }
}
