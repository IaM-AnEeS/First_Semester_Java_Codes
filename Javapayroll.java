import java.util.Scanner;
public class Javapayroll {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double hours;
        double rate;
        double pay;
        System.out.println("How much hours did you work ?");
        hours=input.nextDouble();
        System.out.println("How much you get paid fo per hour ?");
        rate=input.nextDouble();

        if(hours<=40)
            pay=rate*hours;
        else
            pay=(hours-40)*(1.5*rate)+40*rate;
        System.out.println("you earnes $"+pay);


    }
}