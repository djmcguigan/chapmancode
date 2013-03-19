import kareltherobot.*;

public class flagbot implements Directions
{
    public static void main (String[] args)
    {
        UrRobot karel = new UrRobot(1,2,East,1);
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.putBeeper();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnOff();
    }
    
    static
    {
        World.reset();
        World.readWorld("ch2_6.kwld");
        World.setDelay(20);
        World.setVisible(true);
    }
}