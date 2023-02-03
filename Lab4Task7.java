import java.util.Scanner;
public class Lab4Task7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the  length1 : " );
        float length1= input.nextFloat();
        System.out.print("Enter the  length2 : " );
        float length2= input.nextFloat();
        System.out.print("Enter the  width1 : " );
        float width1= input.nextFloat();
        System.out.print("Enter the  width2 : " );
        float width2= input.nextFloat();
         float area1,area2;
         area1=length1*width1;
         area2=length2*width2;
         if (area1 > area2){
             System.out.println("Area of a reactangle 1 is greater");
         }
         else if(area1<area2) {
             System.out.println("Area of a rectangle 2 is greater");
         }
         else{
             System.out.println("Area of rectangle is same");
         }
    }
}
