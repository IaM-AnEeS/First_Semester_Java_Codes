//Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer. For
//        example, if an integer is 932, the sum of all its digits is 14
import java.util.Scanner;
public class Lab3Task8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter a number between 0 to1000");
        int number=input.nextInt();
        int firstDigit = number % 10;
        int remainingNumber = number / 10;
        int SecondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int sum = thirdDigit + SecondDigit + firstDigit;
        System.out.println("The sum of all digits in " + number + " is " + sum);
        
    }
}
