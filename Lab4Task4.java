import java.util.Scanner;
public class Lab4Task4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a= input.nextInt();
        System.out.println("Enter the value of b : ");
        int b=input.nextInt();
        System.out.println("Enter the value of c : ");
        int c=input.nextInt();
        if(a<b && a<c){
            System.out.println("a is smaller value : "+a );
        }
        else if(b<a && b<c){
            System.out.println("b is the smaller value : "+b);
        } else if (c<a && c<b) {
            System.out.println("c is the smaller value : "+c);

        }
    }
}
