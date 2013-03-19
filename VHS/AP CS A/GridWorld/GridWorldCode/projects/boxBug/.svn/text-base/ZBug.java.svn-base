import info.gridworld.actor.Bug;

public class ZBug extends Bug
{
    private int legLength;
    private int steps;
    private int totalLength;
    private int count;
    
    public ZBug(int length)
    {
        steps = 0;
        count = 0;
        legLength = length;
        setDirection(90);
        totalLength = (legLength * 3);
    }
    
    public void act()
    {
        if(count < totalLength)
        {
            if (steps < legLength && canMove())
            {
                move();
                steps++;
                count++;
            }
            else 
            {
                if(steps == legLength)
                {
                    setDirection(225);
                    steps = 0;
                }
                else if(count == (legLength * 2))
                {
                    setDirection(90);
                    steps = 0;
                }
            }
        
        }
    }
}