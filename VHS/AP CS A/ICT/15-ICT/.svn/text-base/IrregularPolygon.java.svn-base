import java.util.ArrayList;
import java.awt.geom.*;
import gpdraw.*;

public class IrregularPolygon
{
    private ArrayList <Point2D.Double> myPolygon;
    
    public IrregularPolygon()
    {
        myPolygon = new ArrayList <Point2D.Double> ();
    }
    
    public void add(Point2D.Double aPoint)
    {
        myPolygon.add(aPoint);
    }
    
    public void draw()
    {
        SketchPad paper = new SketchPad(300,300);
        DrawingTool pencil = new DrawingTool(paper);
        
        pencil.up();
        Point2D.Double pt = myPolygon.get(0);
        pencil.move(pt.getX(), pt.getY());
        pencil.down();
        for(int i = 1; i < myPolygon.size(); i++)
        {
            pt = myPolygon.get(i);
            pencil.move(pt.getX(), pt.getY());
        }
        pt = myPolygon.get(0);
        pencil.move(pt.getX(), pt.getY());
    }
    
    public double perimeter()
    {
        double sum = 0.0;
        for (int num = 0; num < myPolygon.size() - 1; num++)
        {
            Point2D.Double ptA = myPolygon.get(num);
            Point2D.Double ptB = myPolygon.get(num + 1);
            sum += ptA.distance(ptB);
        }
        Point2D.Double ptA = myPolygon.get(myPolygon.size() - 1);
        Point2D.Double ptB = myPolygon.get(0);
        sum += ptA.distance(ptB);
        return sum;
    }
    
    public double area()
    {
        double rhs = 0, lhs = 0;
        Point2D.Double ptA, ptB = null;
        for(int i = 0; i < myPolygon.size() - 1; i++)
        {
            ptA = myPolygon.get(i);
            ptB = myPolygon.get(i + 1);
            lhs += ptA.getX() * ptB.getY();
            rhs += ptA.getY() * ptB.getX();
        }
        ptA = myPolygon.get(myPolygon.size() - 1);
        ptB = myPolygon.get(0);
        lhs += ptA.getX() * ptB.getY();
        rhs += ptB.getX() * ptA.getY();
        return .5 * Math.abs(lhs - rhs);
    }
}