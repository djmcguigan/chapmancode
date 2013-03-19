import kareltherobot.*;

public class HBot extends BetterTurnerRobot
{
    public HBot (int st, int ave, Direction dir, int beeps)
    {
        super(st, ave, dir, beeps);
    }
    public void drawH()
    {
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        turnAround();
        move();
        turnLeft();
        move();
        putBeeper();
        move();
        putBeeper();
        turnLeft();
        move();
        putBeeper();
        turnAround();
        move();
        move();
        putBeeper();
        turnRight();
        move();
        move();
        turnRight();
    }
}