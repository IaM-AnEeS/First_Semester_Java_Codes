import java.util.Scanner;
public class Lab7Task1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        System.out.println("Enter the integer");
//        int digits=input.nextInt();
//        System.out.println("The sum is "+sumDigit(digits));

        System.out.println("Enter the number ");
        int num1=input.nextInt();
        reverse(num1);
    }
//    public static int sumDigit(long n){
////        int temp=(int)Math.abs(n);
////        int sum=0;
////        while(temp!=0){
////            sum+=(temp%10);
////            temp=temp/10;
////        }
//        return sum;
//    }
    public static void reverse(int number){
        while (number > 0) {
            System.out.print((number % 10));
            number /= 10;
        }
        System.out.println();
    }
}
