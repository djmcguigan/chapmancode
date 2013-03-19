import java.util.Scanner;
import java.awt.geom.*;

public class IrrPolyDriver
{
    public static void main(String[] args)
    {
        Scanner shmen = new Scanner(System.in);
        
        IrregularPolygon kyle_Is_A_n00b = new IrregularPolygon();
        System.out.print("Input number of points in polygon --> ");
        int numPoints = shmen.nextInt();
        System.out.println();
        
        for(int i = 0; i < numPoints; i++)
        {
            System.out.print("Input x and y coordinates with a space inbetween --> ");
            int x = shmen.nextInt();
            int y = shmen.nextInt();
            kyle_Is_A_n00b.add(new Point2D.Double(x,y));
            System.out.println();
        }
        
        kyle_Is_A_n00b.draw();
        System.out.print("The perimeter of the polygon is --> ");
        System.out.printf("%.2f" , kyle_Is_A_n00b.perimeter());
        System.out.println();
        System.out.print("The area of the polygon is --> ");
        System.out.printf("%.2f" , kyle_Is_A_n00b.area());
        System.out.println();
    }
}