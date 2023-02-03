import java.util.Scanner;
public class Lab4Task5 {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.println("Enter the Value of a : ");
        int a= input.nextInt();
        System.out.println("Enter the value of b : ");
        int b=input.nextInt();
        System.out.println("Enter the value of b : ");
        int c=input.nextInt();
        if(a==b || a==c){
            System.out.println("2");
        }
        else if (b==a || b==c) {
            System.out.println("2");
        }
        else if (c==a || c==a){
            System.out.println("2");
        }
        else if((a==b && a==c) && (b==a && b==c) && (c==a && c==a)) {
            System.out.println("3");
        }
        else{
            System.out.println("0");
        }
//        if(a!=b && a!=c){
//            System.out.println("0");
//        }
//        else if (b!=a && b!=c) {
//            System.out.println("0");
//        }
//        else if (c!=a && c!=a){
//            System.out.println("0");
//        }

    }
}
