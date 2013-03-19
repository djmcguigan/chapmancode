import gpdraw.*;

public class DrawBenzene
{
    private DrawingTool myPencil;
    private SketchPad   myPaper;
    
    public DrawBenzene()
    {
        myPaper = new SketchPad(500,500);
        myPencil = new DrawingTool(myPaper);
    }
    
    public void draw()
    {
        myPencil.drawCircle(100);
        myPencil.setDirection(90);
        myPencil.up();
        myPencil.forward(150);
        myPencil.down();
        myPencil.setDirection(330);
        myPencil.forward(150);
        myPencil.setDirection(270);
        myPencil.forward(150);
        myPencil.setDirection(210);
        myPencil.forward(150);
        myPencil.setDirection(150);
        myPencil.forward(150);
        myPencil.setDirection(90);
        myPencil.forward(150);
        myPencil.setDirection(30);
        myPencil.forward(150);
        myPencil.home();
        myPencil.setDirection(180);
        myPencil.up();
        myPencil.forward(50);
        myPencil.setDirection(0);
        myPencil.down();
        myPencil.drawString("McGuigy's Benzene");
    }
}