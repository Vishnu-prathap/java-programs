import java.util.Scanner;

public class AddTwoNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number for addition:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number for addition:");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of "+num1+" and "+num2+" is "+sum);
    }
}