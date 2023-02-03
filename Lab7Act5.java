import java.util.Scanner;
public class Lab7Act5 {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("Enter a non-negitive integer: ");
        int n=input.nextInt();
        System.out.println("Fatorial of "+n+" is "+factorial(n));
    }
    public static long factorial(int n){
        if(n==0)
            return 1;
        else
            return n*factorial(n-1);
    }
}
