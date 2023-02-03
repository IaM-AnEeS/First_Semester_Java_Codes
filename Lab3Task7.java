//A cricket game is to be held in a stadium and there are four seating categories available for the
// audience. Class A seats cost $20, Class B seats cost $15, Class C seats cost $10, and Class D seats cost
// $5. You should write a JAVA program that asks how many tickets for each class of seats were sold and
//finally display the total income generated and income corresponding to ticket sales.
import java.util.Scanner;
public class Lab3Task7 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter the number of tickets sold of A Category : ");
        int category_A=input.nextInt();

        System.out.println("Enter the number of tickets sold of B Category : ");
        int category_B=input.nextInt();

        System.out.println("Enter the number of tickets sold of C Category : ");
        int category_C=input.nextInt();

        System.out.println("Enter the number of tickets sold of D Category : ");
        int category_D=input.nextInt();

        double Amount_A=category_A*20;
        System.out.println("Amount generate from Category A : $"+Amount_A);
        double Amount_B=category_A*15;
        System.out.println("Amount generate from Category B : $"+Amount_B);
        double Amount_C=category_A*10;
        System.out.println("Amount generate from Category C : $"+Amount_C);
        double Amount_D=category_A*5;
        System.out.println("Amount generate from Category D : $"+Amount_D);
        double Total_Amount=Amount_A+Amount_B+Amount_C+Amount_D;
        System.out.println("Total Money generated from all categories : $"+Total_Amount);

    }
}
