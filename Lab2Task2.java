//incorrect order
//public class Activity2
//{
//    Scanner console = new Scanner(System.in);
//import java.util.*;
//    {
//        public static void main(String[] args)
//        int width;
//        System.out.print("Enter the length: ");
//        width = console.nextInt();
//        System.out.println();
//        int length;
//        21
//        System.out.print("Enter the width: ");
//
//        System.out.println();
//        area = length * width;
//        System.out.println("Area = " + area);
//        System.out.println("Perimeter = " + perimeter);
//        perimeter = 2 * (length + width);
//        int area;
//        int perimeter;
//    }}

// Correct order
import java.util.*;
public class Lab2Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int length;
        int area;
        int width;
        int perimeter;
        System.out.print("Enter the length: ");
        length = console.nextInt();
        System.out.print("Enter the width: ");
        width = console.nextInt();
        area = length * width;
        perimeter = 2 * (length + width);
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}