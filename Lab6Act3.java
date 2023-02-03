import java.util.Scanner;
public class Lab6Act3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the First city : ");
        String city1=input.next();
        System.out.print("Enter the First city : ");
        String city2=input.next();
        if(city1.compareTo(city2)<0)
            System.out.println("The cities in alphabetical order are:"+city1+" "+city2);
        else
            System.out.println("The cities in alphabetical order are:"+city2+""+city1);
    }
}
