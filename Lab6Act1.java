import java.util.Scanner;
public class Lab6Act1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double X1=input.nextDouble();
        double Y1=input.nextDouble();
        double X2=input.nextDouble();
        double Y2=input.nextDouble();
        double X3=input.nextDouble();
        double Y3=input.nextDouble();
//        Compare three sides
        double a=Math.sqrt((X2-X3)*(X2-X3)+(Y2-Y3)*(Y2-Y3));
        double b=Math.sqrt((X1-X3)*(X1-X3)+(Y1-Y3)*(Y1-Y3));
        double c=Math.sqrt((X1-X2)*(X1-X2)+(Y1-Y2)*(Y1-Y2));
//        compare three angles
        double A=Math.toDegrees(Math.acos((a*a-b*b-c*c)/(-2*b*c)));
        double B=Math.toDegrees(Math.acos((b*b-a*a-c*c)/(-2*a*c)));
        double C=Math.toDegrees(Math.acos((c*c-b*b-a*a)/(-2*a*b)));
//        Display result
        System.out.println("The three angles are "+Math.round(A*100)/100.0+" "+Math.round(B*100)/100.0+" "+Math.round(C*100)/100.0);
    }

}
