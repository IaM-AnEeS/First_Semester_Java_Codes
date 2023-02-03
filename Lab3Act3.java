//This program calculates the amount of pay that will be contributed to a retirement plan if 5%, 8%, or
//10% of monthly pay is withheld
public class Lab3Act3 {
    public static void main(String[] args) {
        double Contribution;
        double monthlyIncome=6000.0;
        Contribution=monthlyIncome*0.05;
        System.out.println("5 percent is $" + Contribution +" per month.");
        Contribution=monthlyIncome*0.08;
        System.out.println("5 percent is $" + Contribution +" per month.");
        Contribution=monthlyIncome*0.1;
        System.out.println("5 percent is $" + Contribution +" per month.");



    }
}
