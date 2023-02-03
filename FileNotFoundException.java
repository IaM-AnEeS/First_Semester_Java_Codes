//import java.util.Scanner;
import java.util.*;
public class FileNotFoundException {
    public static void main(String[] args) {
        Scanner inputFromConsole=new Scanner(System.in);
        System.out.println("Enter the File name");
        String filename=inputFromConsole.nextLine();
        try{
            Scanner inputfromFile=new Scanner(new File(filename));
            System.out.println("File"+filename+"exits");
        }
        catch(FileNotFoundException ex){
            System.out.println("Exception "+filename+" not found");
        }
    }
}
