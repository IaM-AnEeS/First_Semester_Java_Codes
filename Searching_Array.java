import java.util.Scanner;
public class Searching_Array {
    public static void main(String[] args) {
        int a []=new int[10];
        int Search_Array;
        int counter=0;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the Elements in Array ");
        for (int i=0;i< a.length;i++){
             a[i]=input.nextInt();
        }
        System.out.println("Array Elements");
        for (int i=0;i< a.length;i++){
            System.out.println(a[i]+"");
        }
        System.out.println("Enter the searching array");
        Search_Array=input.nextInt();
        for (int i=0;i< a.length;i++) {
            if (a[i] == Search_Array){
                counter++;
            }
        }
        if(counter>0)
            System.out.println("Item is Found "+counter+" Times");
        else
            System.out.println("Item is not Found");
    }
}
