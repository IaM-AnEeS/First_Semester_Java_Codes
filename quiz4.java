import java.util.Scanner;
public class quiz4 {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
        System.out.println("Enter You Salary :");
        double salary=input.nextInt();
        double Tax;
        if(salary<=50000.0){
            Tax=0;
        }
        else if(salary<=100000.0){
        Tax=(0.03*(salary-50000.0));
        }
        else if(salary<=300000.0){
            Tax=(0.05*(salary-100000.0)+(0.03*50000.0));
        }
        else if(salary<=500000.0){
            Tax=(0.07*(salary-300000.0))+(0.05*(salary-100000.0))+(0.03*50000.0);
        }
        else if(salary<=1000000.0){
            Tax=(0.10*(salary-500000.0))+(0.07*(salary-300000.0))+(0.05*(salary-100000.0))+(0.03*50000.0);
        }
        else
            Tax=(0.12*(salary-1000000.0))+(0.10*(salary-500000.0))+(0.07*(salary-300000.0))+(0.05*(salary-100000.0))+(0.03*50000.0);

        System.out.println("Your Tax for "+salary+" is "+Tax);

    }
}
