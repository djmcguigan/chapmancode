import gpdraw.*;

public class DrawHouse
{
    private DrawingTool myPencil;
    private SketchPad   myPaper;
    
    public DrawHouse()
    {
        myPaper = new SketchPad(500, 500);
        myPencil = new DrawingTool(myPaper);
    }
    
    public void draw()
    {
        // draw house
        myPencil.home();
        myPencil.setDirection(180);
        myPencil.forward(150);
        myPencil.turnLeft();
        myPencil.forward(200);
        myPencil.turnLeft();
        myPencil.forward(300);
        myPencil.turnLeft();
        myPencil.forward(200);
        myPencil.turnLeft();
        myPencil.forward(150);
        myPencil.up();
        myPencil.forward(150);
        // draw roof
        myPencil.setDirection(30);
        myPencil.down();
        myPencil.forward(174);
        myPencil.setDirection(330);
        myPencil.forward(174);
        // write name
        myPencil.home();
        myPencil.setDirection(180);
        myPencil.forward(100);
        myPencil.setDirection(0);
        myPencil.drawString("McGuigy's House");
    }
}