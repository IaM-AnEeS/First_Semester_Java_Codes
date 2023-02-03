import com.sun.tools.jconsole.JConsoleContext;

import java.util.Scanner;
public class Lab5Act2 {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of values  integer list : ");
        int limit=input.nextInt();
        System.out.println();
         int sum=0;
         int counter=0;
        System.out.print("Enter "+limit+ " integers.");
        while(counter<limit) {
            int number= input.nextInt();
            sum+=number;
            counter++;
        }
        System.out.printf("The sum of the %d"+"numbers=%d%n",limit,sum);
        if(counter!=0){
            System.out.printf("The average=%d%n",(sum/counter));
        }
        else
        System.out.println("No input");

    }
}
