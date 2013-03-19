import gpdraw.*;
public class Circle
{
    private double myX;
    private double myY;
    private double myRadius;
    
    private static SketchPad myPaper = new SketchPad(1000,1000);
    private static DrawingTool myPen = new DrawingTool(myPaper);
    
    public Circle()
    {
        myX = 0;
        myY = 0;
        myRadius = 0;
    }
    
    public Circle(double x, double y, double radius)
    {
        myX = x;
        myY = y;
        myRadius = radius;
    }
        
    public void draw()
    {
        myPen.up();
        myPen.move(myX , myY);
        myPen.down();
        myPen.drawCircle(myRadius);
    }
    
    public double getCircumference()
    {
        return Math.PI * (myRadius + myRadius);
    }
    
    public double getArea()
    {
        return Math.PI * (myRadius * myRadius);
    }
}