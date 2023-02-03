import java.util.Scanner;
public class Lab3Task2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of peoples : ");
        int peoples=input.nextInt();
        System.out.println("Enter the number of Apples in the bucket : ");
        int Apples=input.nextInt();
        int distribute=Apples/peoples;
        System.out.println("Apples that is destributed to each person : "+distribute);
        int remaining=(Apples-(distribute*peoples));
        System.out.println("Apples remaining in the bucket : "+remaining);


    }
}
