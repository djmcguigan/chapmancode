
/**
 * Write a description of class QuickCrab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import info.gridworld.actor.*;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

public class QuickCrab extends CrabCritter
{
     /**
     * @return list of empty locations immediately to the right and to the left
     */
    public ArrayList<Location> getMoveLocations()
    {
        ArrayList<Location> locs = new ArrayList<Location>();
        Location loc = getLocation();
        Location oneLeft = loc.getAdjacentLocation(getDirection() + Location.LEFT);
        Location twoLeft = oneLeft.getAdjacentLocation(getDirection() + Location.LEFT);
        Location oneRight = loc.getAdjacentLocation(getDirection() + Location.RIGHT);
        Location twoRight = oneRight.getAdjacentLocation(getDirection() + Location.RIGHT);
        
        //checking left side
        if((getGrid().isValid(oneLeft)) && (getGrid().isValid(twoLeft)))
        {
            Actor a = getGrid().get(oneLeft);
            Actor b = getGrid().get(twoLeft);
            if(a == null)
                if(b == null)
                    locs.add(twoLeft);
        }
        
        //checking right side
        if((getGrid().isValid(oneRight)) && (getGrid().isValid(twoRight)))
        {
            Actor a = getGrid().get(oneRight);
            Actor b = getGrid().get(twoRight);
            if(a == null)
                if(b == null)
                    locs.add(twoRight);
        }
        if (locs.size() == 0)
            return super.getMoveLocations();

      

        return locs;
    }

   
}
