import java.util.Scanner;

public class Lab7Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = console.nextInt();

        if (isPalindrom(num)) {
            System.out.println("Number is palindrom");
        } else {
            System.out.println("Number is not palindrom");
        }
    }


    public static boolean isPalindrom(int number) {
        int temp = number;
        int remainder;
        int reverse = 0;

        while (temp > 0) {
            remainder = temp % 10;
            temp = temp / 10;
            reverse = reverse * 10 + remainder;
        }

        return reverse == number;
    }
//    public static void reverse(int number){
//        while (number > 0) {
//            System.out.print((number % 10));
//            number /= 10;
//        }
//        System.out.println();

}
