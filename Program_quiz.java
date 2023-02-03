import java.util.Scanner;

public class Program_quiz {
    public static void main(String[] args) {
        int a[] = new int[20];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the elements in array");
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
        if (Searching_Array(a) > 0)
            System.out.println("Item found " + Searching_Array(a) + " times");
        else
            System.out.println("Item not Found");
    }

    public static int Searching_Array(int a[]) {
        int counter=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Array Elements");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("Enter the searching array");
        int Search_Array = input.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == Search_Array)
                counter++;
        }
        return a[counter];
    }
}