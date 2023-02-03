import java.util.Scanner;
public class Lab2Task3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int SECRET=11;
        double rate=12.50;
        int num1;
        int num2;
        int newNum;
        String name;
        double hoursWorked,wages;
        double payrate=12.50;
        System.out.println("Enter the value for num1: ");
        num1=input.nextInt();
        System.out.println("Enter the value for num2: ");
        num2=input.nextInt();
        System.out.println("The value of num1="+num1+""+" and the value of num2=");
        newNum=(num1*num2)+num2;
        System.out.println("The value (num1*num2)+num2 is:"+newNum);
        newNum=SECRET+newNum;
        System.out.println("The walue of newNum"+newNum);

        System.out.println("Please enter your lastname: ");
        name=input.next();
        System.out.println("Name="+name);

        System.out.println("Enter a decimal number between 0 to 70:");
        hoursWorked=input.nextDouble();
        System.out.println("HoursWorked="+hoursWorked);
        wages=hoursWorked*payrate;
        System.out.println("Wages"+wages);


    }
}
