import java.util.Scanner;
public class Lab10Act3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [][]array=new int[3][4];
        System.out.println("Enter the array elements");
        for (int i=0;i<3;i++){
            for (int j=0; j<4;j++)
                array[i][j]=input.nextInt();
        }
        System.out.println("The elements of 2D array ");
        for (int i=0;i<3;i++){
            for (int j=0; j<4;j++)
                System.out.println(array[i][j]+" ");
        }

    }
}
