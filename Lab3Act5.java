//This program displays the sales tax with two digits after the decimal point
import java.util.Scanner;
public class Lab3Act5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your Purchase  Amount : ");
        double purchaseAmount=input.nextDouble();
        double tax=purchaseAmount*0.06;
        System.out.println("Sales tax is $" +tax);

    }
}
