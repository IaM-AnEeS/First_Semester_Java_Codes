
 import java.util.Scanner;
public class Lab3Task3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number of student in class 1: ");
        int Class1= input.nextInt();
        System.out.println("Enter the number of student in class 2: ");
        int Class2= input.nextInt();
        System.out.println("Enter the number of student in class 3: ");
        int Class3= input.nextInt();

        int TotalStudents=Class1+Class2+Class3;
        System.out.println("The total students :"+TotalStudents);

        int desks=(TotalStudents/2);

        if(Class1%2!=0) {
            desks=((TotalStudents/2)+1);
        }
        if(Class1%2!=0&&Class2%2!=0) {
            desks=((TotalStudents/2)+1);
        }
        if(Class1%2!=0&&Class2%2!=0&&Class3%2!=0) {
            desks=((TotalStudents/2)+2);
        }
        System.out.println("The total desks that is needed :"+desks);
    }
}
