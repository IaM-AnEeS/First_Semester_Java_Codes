import java.util.Scanner;
public class Lab3Task1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the dollars in decimal: ");
        double decimal=input.nextDouble();
//        converting decimal into cents
       double cents=decimal*100;
        System.out.println("Decimal into  cents :"+cents);
//        finding the number of dollars
        double Dollars=(cents/100);
        System.out.println("Number of Dollars: "+Dollars);
//        Finding extra cents
       double remainingCents=cents%100;
        System.out.println("Number of remainingCents: "+remainingCents);
//        Finding quarter in remainingCents
        double quarter=remainingCents/25;
        System.out.println("Number of quaters in remaining Cents : "+quarter);
//        Finding  remainingCents in  quarter
        double remainingCentsInQuater=quarter%25;
        System.out.println("Remaining Cents in quarter : "+remainingCentsInQuater);
//        Finding  dimes in  RemainingCentsInQuater
        double dimes=remainingCents/10;
        System.out.println("Number of dimes in Remaining Cents : "+dimes);
//        Finding remaingCentsIndimes
        double remainingCenteIndimes=dimes%10;
        System.out.println("Remaining cents in dimes :"+remainingCenteIndimes);
//        Finding nicles in remainingCentesin dimes
        double nickels=remainingCents/5;
        System.out.println("Number of nickels in Remaining cents"+nickels);
//        Finding remaining cents in nickels
        double remainingCentsInNickels=nickels%5;
        System.out.println("Remaining cents in nikels : "+remainingCentsInNickels);

    }
}
