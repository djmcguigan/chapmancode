import gpdraw.*;
public class Rectangle
{
    private double myX;
    private double myY;
    private double myWidth;
    private double myHeight;
    
    private static SketchPad myPaper = new SketchPad(1000,1000);
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
        myX = x;
        myY = y;
        myWidth = width;
        myHeight = height;
    }
    
    public double getPerimeter()
    {
        return (2 * (myWidth + myHeight));
    }
    
    public double getArea()
    {
        return (myWidth * myHeight);
    }    
    
    public void draw()
    {
        myPen.up();
        myPen.move(myX , myY);
        myPen.down();
        myPen.move(myX + myWidth, myY);
        myPen.move(myX + myWidth, myY + myHeight);
        myPen.move(myX, myY + myHeight);
        myPen.move(myX, myY);
    }
}