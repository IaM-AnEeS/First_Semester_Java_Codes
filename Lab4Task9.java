import java.util.Scanner;
public class Lab4Task9 {
    public static void main(String[] args) {
        final  int peny=1;
        final int nickle =5;
        final int dime =10;
        final int quater=25;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of pennies : ");
        int numberOfPennies= input.nextInt();
        System.out.println("Enter the number of nickles : ");
        int numberOfNickles= input.nextInt();
        System.out.println("Enter the number of dimess : ");
        int numberOfDimes= input.nextInt();
        System.out.println("Enter the number of quaters : ");
        int numberOfQuaters= input.nextInt();
        int penye=peny*numberOfPennies;
        int nickles=nickle*numberOfNickles;
        int dimes=dime*numberOfDimes;
        int quaters=quater*numberOfQuaters;
        if (penye+nickles+dimes+quaters==100){
            System.out.println("Congradulation on winning the game");
        }
        else if(penye+nickles+dimes+quaters>100){
            System.out.println("Amount you enter is greater");
        }
        else if(penye+nickles+dimes+quaters<100){
            System.out.println("Amount you enter is lesser");
        }

    }
}
