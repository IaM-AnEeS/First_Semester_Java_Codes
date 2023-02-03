import java.util.InputMismatchException;
import java.util.Scanner;
public class Lab11Task1 {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the value of num1: ");
                int num1 = input.nextInt();
                System.out.print("Enter the value of num2: ");
                int num2 = input.nextInt();
                int sum = num1 + num2;
                System.out.println("The addition of " + num1 + " and " + num2 + " is " + sum);
                break;
            } catch (InputMismatchException ex) {
                System.out.println("You Enter an invalid input ");
                System.out.println("Try again");
            }
        }
    }
}
