import info.gridworld.actor.*;
import info.gridworld.grid.*;

public class Jumper extends Bug
{

    public Jumper()
    {
        
    }
    
    public boolean canMove()
    {
        Grid <Actor> gr = getGrid();
        Location loc = getLocation();
        Location oneAhead = loc.getAdjacentLocation(getDirection());
        Location twoAhead = oneAhead.getAdjacentLocation(getDirection());
        if(gr.isValid(oneAhead))
        {
            if(gr.isValid(twoAhead))
            {
                
                Actor a = gr.get(twoAhead);
                if(a == null)
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    public void move()
    {
        Location loc = getLocation();
        Location oneAhead = loc.getAdjacentLocation(getDirection());
        Location twoAhead = oneAhead.getAdjacentLocation(getDirection());
        if(canMove() == true)
        {
            moveTo(twoAhead);
        }
        else
        {
            super.turn();
        }
    }
}