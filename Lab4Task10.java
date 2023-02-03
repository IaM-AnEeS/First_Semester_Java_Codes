import java.util.Scanner;
public class Lab4Task10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How many books you purchase this month : ");
        int books= input.nextInt();int i = 0;
        if(books==0){
            System.out.println("you earn zero points");
        }
        else if (books==1) {
            System.out.println("you earn 5 points");
        }
        else if (books==2) {
            System.out.println("you earn 15 points");
        }
        else if (books==3) {
            System.out.println("you earn 30 points");
        }
        else if (books>3) {
            System.out.println("you earn 60 points");
        }
    }
}
