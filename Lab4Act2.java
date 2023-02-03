//This program prompts the user to enter an integer. If the number is a multiple of 5, the program
// displays HiFive. If the number is divisible by 2, it displays HiEven
import java.util.Scanner;
public class Lab4Act2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        if (number % 5 == 0)
            System.out.println("HiFive");
        if (number % 2 == 0)
            System.out.println("HiEven");
    }
}
