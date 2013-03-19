import kareltherobot.*;

public class BetterTurnerRobot extends UrRobot
{
    public BetterTurnerRobot(int st, int ave, Direction dir, int beeps)
    {
        super(st, ave, dir, beeps);
    }
    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void turnAround()
    {
        turnLeft();
        turnLeft();
    }
    public void stepBackward()
    {
        turnAround();
        move();
        turnAround();
    }
}