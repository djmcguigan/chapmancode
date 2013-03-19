import kareltherobot.*;

public class BeeperLayer extends BetterTurnerRobot
{
    public BeeperLayer(int st, int ave, Direction dir, int beeps)
    {
        super(st, ave, dir, beeps);
    }
    public void goToOrigin()
    {
        while (!facingWest())
        {
            turnLeft();
        }
        while (frontIsClear())
        {
            move();
        }
        turnLeft();
        while (frontIsClear())
        {
            move();
        }
        turnLeft();
    }
    
    public void measure()
    {
        while (nextToABeeper())
        {
            move();
        }
    }
    
    public void plantBeeps()
    {
        while (frontIsClear() && anyBeepersInBeeperBag())
        {
            putBeeper();
            move();
        }
    }
    
    public void harvestBeeps()
    {
        while (frontIsClear())
        {
            if (nextToABeeper())
            {
                pickBeeper();
                move();
            }
            else
            {
                move();
            }
        }
        if (nextToABeeper())
        {
            pickBeeper();
        }
    }
    
    public void moveNext()
    {
        while (nextToABeeper())
        {
            move();
        }
        turnLeft();
    }
    
    public void goBack()
    {
        turnAround();
            while (!nextToABeeper())
            {
                move();
            }   
            while (nextToABeeper())
            {
                move();
            }
        turnLeft();
        move();
        turnLeft();
    }
}