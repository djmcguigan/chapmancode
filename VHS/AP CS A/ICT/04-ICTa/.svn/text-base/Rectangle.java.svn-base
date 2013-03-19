
/**
 * Write a description of class RectangleClass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import gpdraw.*;
public class Rectangle
{
    private double myX;
    private double myY;
    private double myWidth;
    private double myHeight;
    
    private static SketchPad myPaper = new SketchPad(500,500);
    private static DrawingTool myPen = new DrawingTool(myPaper);
    
    public Rectangle()
    {
        myX = 0;
        myY = 0;
        myWidth = 0;
        myHeight = 0;
    }
    
    public Rectangle(double x, double y, double width, double height)
    {
        x = myX;
        y = myY;
        width = myWidth;
        height = myHeight;    
    }
    
    public double getPerimeter()
    {

    }
    
    public double getArea()
    {

    }
    
    public void draw()
    {
        myPen.up();
        myPen.move(myX,myY);
        myPen.down();
        myPen.move(myX + (myX + myWidth));
        myPen.up();
    }
}