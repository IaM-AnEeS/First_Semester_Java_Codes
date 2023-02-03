import java.util.InputMismatchException;
import java.util.Scanner;
public class Lab11Act2 {
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("Enter an integer :");
                Scanner input = new Scanner(System.in);
                int n = input.nextInt();
                System.out.println("Factorial of " + n + " is " + factorial(n));
                break;
            }
            catch(InputMismatchException ex){
                System.out.println("You have entered an invalid put");
                System.out.println("Try Again");
            }
        }
    }
    static int factorial(int n) {
        int f = 1;
        for (int i =n; i>=1; i-- )
            f = f * i;
        return f;
    }
}
