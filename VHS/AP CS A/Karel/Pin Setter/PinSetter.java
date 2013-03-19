import kareltherobot.*;

public class PinSetter extends BetterTurnerRobot
{
    public PinSetter (int st, int ave, Direction dir, int beeps)
    {
        super(st, ave, dir, beeps);
    }
        
    public void setPins()
    {
        move();
        putBeeper();
        turnLeft();
        move();
        turnRight();
        move();
        turnRight();
        setRow2();
        turnLeft();
        move();
        turnLeft();
        setRow3();
        turnRight();
        move();
        turnRight();
        setRow4();
        goHome();
    }
        
    private void setRow2()
    {
        putBeeper();
        move();
        move();
        putBeeper();
        move();
    }
        
    private void setRow3()
    {
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        move();
    }
        
    private  void setRow4()
    {
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
    }
        
    private void goHome()
    {
        turnRight();
        move();
        move();
        move();
        move();
        turnRight();
        move();
        move();
        move();
        turnRight();
    }
}