import kareltherobot.*;

public class CarpetLayer extends BetterTurnerRobot
{
    public CarpetLayer(int st, int ave, Direction dir, int beeps)
    {
        super(st, ave, dir, beeps);
    }
    public void moveTo()
    {
        move();
        turnLeft();
        move();
        turnLeft();
        move();
    }
    public void checkRoom()
    {
        if (!frontIsClear())
        {
            turnLeft();
            if (!frontIsClear())
            {
                turnAround();
                if (!frontIsClear())
                {
                    putBeeper();
                    turnRight();
                }
                else
                {
                    turnRight();
                }
            }
            else
            {
                turnLeft();
            }
        }
        else
        {
            turnAround();
        }
    }
    public void moveLeft()
    {
        move();
        turnLeft();
        move();
    }
}