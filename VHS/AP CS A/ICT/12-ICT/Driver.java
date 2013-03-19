
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Driver
{
    public static void main(String[] args)
    {
        Scanner parker = new Scanner(System.in);
        
        System.out.print("Enter dimensions for times table -->  ");
        int col = parker.nextInt();
        int row = parker.nextInt();
        System.out.println();
        Pictures.timesTables(col, row);
        System.out.println("\n");
        
        System.out.print("Enter number for asterisk pyramid -->  ");
        int num = parker.nextInt();
        System.out.println();
        Pictures.pyramid(num);
    }
}
