//This program calculates hourly wages plus overtime.
public class Lab3Act2 {
    public static void main(String[] args) {
        double regularWages;
        double basePay=25;
        double regularHours=40;
        double overtimeWages;
        double overTimePay=37.5;
        double overtimeHours=10;
        double totalWages;
        regularWages=basePay*regularHours;
        overtimeWages=overTimePay*overtimeHours;
        totalWages=overtimeWages+regularWages;
        System.out.println("Your total wages of this month is: "+totalWages);

    }
}
