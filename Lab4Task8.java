import java.util.Scanner;
public class Lab4Task8 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the date : ");
        int date= input.nextInt();;
        System.out.println("Enter the month : ");
        int month= input.nextInt();
        System.out.println("Enter the year in two number : ");
        int year= input.nextInt();
        if ((date*month)==year){
            System.out.println("The date is Magic : "+date+"/"+month+"/"+year);
        }
        else{
            System.out.println("The date is not a magic sorry");
        }
        
    }
}
