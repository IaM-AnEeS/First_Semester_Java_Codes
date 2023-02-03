import java.util.*;
public class Lab5Act4 {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        int num=(int)(Math.random()*100);
        int guess;
       boolean done=false;
       while(!done){
           System.out.println("Enter the number between 0 to 99 : ");
           guess=input.nextInt();
           System.out.println();
           if (guess==num){
               System.out.println("Congrats You guess correctly");
               done=true;
           }
           else if (guess>num) {
               System.out.println("your guess is too high");
           }
           else
               System.out.println("Your guess is too low");
       }

    }
}
