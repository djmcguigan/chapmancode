public class CircleDriver
{
    public static void main (String[] args)
    {
        Circle circleA = new Circle();
        Circle circleB = new Circle(0, -80, 400);
        Circle circleC = new Circle(100, -100, 20);
        
        
        circleA.draw();
        circleB.draw();
        circleC.draw();
        
        //SOP Circle A
        System.out.println("Perimeter \t= " + circleA.getCircumference());
        System.out.println("Area \t\t= " + circleA.getArea());
        //SOP Circle B
        System.out.println("Perimeter \t= " + circleB.getCircumference());
        System.out.println("Area \t\t= " + circleB.getArea());
        //SOP Circle C
        System.out.println("Perimeter \t= " + circleC.getCircumference());
        System.out.println("Area \t\t= " + circleC.getArea());
    }
}