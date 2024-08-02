
import java.util.Scanner;

public class AddTwoNumbersFourFunctions {
    public static int InputInteger(String value){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the "+value+" number for addition:");
        int nums = sc.nextInt();
        return nums;
    }

    public static int Sum(int num1, int num2){
        return num1+num2;
    }
    public static void  Output(int sum,int num1, int num2){
        System.out.println("The sum of "+num1+" and "+num2+" is " + sum);
        
    }
    public static void main(String[] args){    
        // Input function
        String first = "first";
        String second = "second";
        int num1 = InputInteger("first");
        int num2 = InputInteger("second");
        // Sum function
        int sum = Sum(num1,num2);
        // Output function
        Output(sum,num1,num2);
    }
}
