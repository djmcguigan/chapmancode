public class RectDriver
{
    public static void main (String[] args)
    {
        Rectangle rectA = new Rectangle();
        Rectangle rectB = new Rectangle(0, -80, 400, 160);
        Rectangle rectC = new Rectangle(100, -100, 20, 300);
        
        
        rectA.draw();
        rectB.draw();
        rectC.draw();
        
        
        System.out.println("Perimeter \t= " + rectA.getPerimeter());
        System.out.println("Area \t\t= " + rectA.getArea());
        
        System.out.println("Perimeter \t= " + rectB.getPerimeter());
        System.out.println("Area \t\t= " + rectB.getArea());
        
        System.out.println("Perimeter \t= " + rectC.getPerimeter());
        System.out.println("Area \t\t= " + rectC.getArea());
    }
}