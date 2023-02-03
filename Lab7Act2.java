import java.util.Scanner;
public class Lab7Act2 {
  public  static void grades(double score) {
        if (score >= 90.0) {
            System.out.println("A");
        } else if (score >= 80.0) {
            System.out.println("B");
        } else if (score >= 70.0) {
            System.out.println("C");
        } else if (score >= 60.0) {
            System.out.println("D");
        } else {
            System.out.println("D");
        }

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("The grade is : ");
        grades(96.0);
        System.out.print("The grade is  : ");
        grades(63.0);

    }
}
