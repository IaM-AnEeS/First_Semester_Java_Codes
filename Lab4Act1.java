//his program illustrate the uses of logical operator to calculate Leap Year
import java.util.Scanner;
public class
Lab4Act1 {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter a year: ");
                int year = input.nextInt();
                boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                System.out.println(year + " is a leap year? " + isLeapYear);
    }
}
