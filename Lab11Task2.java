import java.util.InputMismatchException;
import java.util.Scanner;
public class Lab11Task2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while (true){
            try {
                int[] array = new int[10];
                for (int i = 0; i < array.length; i++) {
                    System.out.println("Enter the elements of array: ");
                    array[i] = input.nextInt();
                }
                System.out.println("Enter an index number");
                int IndexNum = input.nextInt();
                System.out.println(array[IndexNum]);
                break;
            } catch (IndexOutOfBoundsException ex){
                System.out.println("You entered the wrong value");
                System.out.println("Try Again");
            }
        }
    }
}
