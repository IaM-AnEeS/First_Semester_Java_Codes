import java.util.Scanner;
public class Lab3Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Cartons ships every mornning to the Shop : ");
        int cartons = input.nextInt();
        double liters = cartons * 3.78;
        System.out.println("The number of liters deliered to the shop :" + liters+"ltr");
        double cost = liters *0.38;
        System.out.println("Cost for producing milk : "+"$"+cost);
        double profit=cartons*0.27;
        System.out.println("Profit on each carton of milk : "+"$"+profit);

    }
}

