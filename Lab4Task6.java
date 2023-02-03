import java.util.Scanner;
public class Lab4Task6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number btween 0 to 10:");
        int num1=input.nextInt();

        if (num1==1){
            System.out.println("Roman numeric value of 1 is : I");
        }  if (num1==2){
            System.out.println("Roman numeric value of 2 is : II");
        }
        else if (num1==3){
            System.out.println("Roman numeric value of 3 is : III");
        }
        else if (num1==4){
            System.out.println("Roman numeric value of 4 is : IV");
        }
        else if (num1==5){
            System.out.println("Roman numeric value of 5 is : V");
        }
        else if (num1==6){
            System.out.println("Roman numeric value of 6 is : VI");
        }
       else if (num1==7){
            System.out.println("Roman numeric value of 7 is : VII");
        }
       else if (num1==8){
            System.out.println("Roman numeric value of 8 is : VIII");
        }
       else if (num1==9){
            System.out.println("Roman numeric value of 9 is : IX");
        }
        else if (num1==9){
            System.out.println("Roman numeric value of 10 is : X");
        }
        else{
            System.out.println("Please enter the number between 1 to 10");
        }
    }
}
