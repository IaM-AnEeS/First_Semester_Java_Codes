import java.sql.SQLOutput;
import java.util.Scanner;
public class SalesTax {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        final double TAX_RATE=0.055;
        double price;
        double tax;
        double total;
        double item;

        System.out.println("Item Discription:   ");
        item=input.nextDouble();
        System.out.println("item Price: $");
        price=input.nextDouble();
        tax=price+TAX_RATE;
        total=price*tax;
//        display result
        System.out.print(item+"      $");
        System.out.println(price);
        System.out.println("Tax     $"+tax);
        System.out.println("Total    $"+total);


    }
}
