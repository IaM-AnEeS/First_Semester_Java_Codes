import java.util.Scanner;
public class Lab3Task4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of minutes passed since midnight: ");
        int minutes=input.nextInt();
        int hours=minutes/60;
        int Minutes=minutes%60;
        System.out.println("Number of minutes have been past since midnight : "+minutes);
        System.out.println("Number of hours that has been passed since mid night is : "+hours+":"+Minutes+"am");

    }
}
