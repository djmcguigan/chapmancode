public class Driver
{
    public static void main(String[] args)
    {
        RegularPolygon poly = new RegularPolygon();
        
        RegularPolygon square = new RegularPolygon(4,10);
        System.out.println("Square:");
        System.out.println("Number of Sides = " + square.getNumSides());
        System.out.println("Side Length = " + square.getSideLength());
        System.out.println("Vertex Angle = " + square.vertexAngle());
        System.out.println("Inscribed Circle = " + square.getr());
        System.out.println("Circumscribed Circle = " + square.getR());
        System.out.println("Perimeter = " + square.perimeter());
        System.out.println("Area = " + square.area());
        System.out.println();
        
        RegularPolygon octagon = new RegularPolygon(8,5.75);
        System.out.println("Octagon:");
        System.out.println("Number of Sides = " + octagon.getNumSides());
        System.out.println("Side Length = " + octagon.getSideLength());
        System.out.println("Vertex Angle = " + octagon.vertexAngle());
        System.out.println("Inscribed Circle = " + octagon.getr());
        System.out.println("Circumscribed Circle = " + octagon.getR());
        System.out.println("Perimeter = " + octagon.perimeter());
        System.out.println("Area = " + octagon.area());
        System.out.println();
        
        RegularPolygon ntngon= new RegularPolygon(19,2);
        System.out.println("19-gon:");
        System.out.println("Number of Sides = " + ntngon.getNumSides());
        System.out.println("Side Length = " + ntngon.getSideLength());
        System.out.println("Vertex Angle = " + ntngon.vertexAngle());
        System.out.println("Inscribed Circle = " + ntngon.getr());
        System.out.println("Circumscribed Circle = " + ntngon.getR());
        System.out.println("Perimeter = " + ntngon.perimeter());
        System.out.println("Area = " + ntngon.area());
        System.out.println();
        
        RegularPolygon nogon = new RegularPolygon(91,.5);
        System.out.println("91-gon:");
        System.out.println("Number of Sides = " + nogon.getNumSides());
        System.out.println("Side Length = " + nogon.getSideLength());
        System.out.println("Vertex Angle = " + nogon.vertexAngle());
        System.out.println("Inscribed Circle = " + nogon.getr());
        System.out.println("Circumscribed Circle = " + nogon.getR());
        System.out.println("Perimeter = " + nogon.perimeter());
        System.out.println("Area = " + nogon.area());
        System.out.println();
    }
}