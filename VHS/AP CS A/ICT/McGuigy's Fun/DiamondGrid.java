import gpdraw.*;
public class DiamondGrid
{
    SketchPad paper = new SketchPad(500,500);
    DrawingTool pencil = new DrawingTool(paper);
    
    public void drawDiamond()
    {
        pencil.up();
        pencil.setDirection(180);
        pencil.forward(20);
        pencil.setDirection(0);
        pencil.down();
        pencil.forward(40);
        pencil.up();
        pencil.home();
        pencil.setDirection(90);
        pencil.forward(20);
        pencil.down();
        pencil.setDirection(270);
        pencil.forward(40);
    }

}
