import java.util.*;
public class Lab4Act3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
            double wages, rate, hours; //Line 1
            System.out.print("Enter the working "+ "hours: ");
            hours = input.nextDouble();
//            System.out.println();
            System.out.print(" Enter the pay rate per hour"+ "rate: ");
            rate = input.nextDouble();
            System.out.println();
            if (hours > 40.0)
                wages = 40.0 * rate +1.5 * rate * (hours - 40.0);
            else
                wages = hours * rate; //Line 11
            System.out.printf("The wages are $%.2f %n",wages);
            System.out.println();
     }
}

