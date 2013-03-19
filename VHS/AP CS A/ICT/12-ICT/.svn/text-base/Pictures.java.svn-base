
/**
 * Write a description of class Pictures here.
 * 
 * @author McGuigy 
 * @version (a version number or a date)
 */
public class Pictures
{
    public static void timesTables(int col, int row)
    {
        System.out.printf("%5s", "");
        for(int c = 1; c <= col; c++)
        {
            System.out.printf("%5d", c);
        }
        System.out.println("\n");
        
        for(int r = 1; r <= row; r++)
        {
           System.out.printf("%5d", r);
           for(int c = 1; c <= col; c++)
           {
              System.out.printf("%5d", r * c);
           }
           System.out.println();
        }
    }
    
    public static void pyramid(int num)
    {
        for(int lines = 1; lines <= num; lines++)
        {
            for(int spaces = 0; spaces <= num - lines; spaces++)
            {
                System.out.print(" ");
            }
            
            for(int stars = 0; stars <= (2 * (lines - 1)); stars ++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
