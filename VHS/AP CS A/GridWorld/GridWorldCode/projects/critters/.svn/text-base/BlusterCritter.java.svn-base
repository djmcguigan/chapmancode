import info.gridworld.actor.*;
import info.gridworld.actor.Critter;
import info.gridworld.grid.*;

import java.util.ArrayList;
import java.awt.*;

public class BlusterCritter extends Critter
{
    private int critterCourage;

    public BlusterCritter(int courage)
    {
        critterCourage = courage;
    }
    
    public ArrayList <Actor> getActors()
    {
        ArrayList <Actor> critters = new ArrayList <Actor>();
        Grid <Actor> gr = getGrid();
        Location loc = getLocation();
        for(int r = loc.getRow() - 2; r <= loc.getRow() + 2; r++)
        {
            for(int c = loc.getCol() - 2; c <= loc.getCol() + 2; c++)
            {
                Location loc1 = new Location(r, c);
                if ((gr.isValid(loc1)))
                {
                    Actor critter = gr.get(loc1);
                    if ((critter != null) && !(loc1.equals(loc)) && critter instanceof Critter)
                        critters.add(critter);
                }
            }
        }
        return critters;
    }
    
    public void processActors(ArrayList <Actor> critters)
    {
        int num = critters.size();
        if (num < critterCourage)
        {
            setColor(getColor().brighter());
            return;
        }
        else if(num >= critterCourage)
        {
            setColor(getColor().darker());
            return;
        }
    }
        
}