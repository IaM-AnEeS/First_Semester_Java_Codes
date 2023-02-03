import java.util.Scanner;
public class Lab5Act5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number,sum=0,count;
        for(count=0;count<5;count++){
            number=input.nextInt();
            sum=sum+number;
            System.out.println("Sum is"+sum);

        }

    }
}
