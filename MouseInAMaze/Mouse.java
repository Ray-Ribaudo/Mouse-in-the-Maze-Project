import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import edu.kzoo.grid.Grid;
import edu.kzoo.grid.GridObject;
import edu.kzoo.grid.Location;
import edu.kzoo.grid.Direction;
import edu.kzoo.util.Debug;
import edu.kzoo.util.NamedColor;
import edu.kzoo.util.RandNumGenerator;
import edu.kzoo.grid.ColorBlock;
/**
 * The Mouse class serves as a class for the mice combined
 *
 * @author Raymond Ribaudo
 * @version 3/8/2022
 */
public class Mouse extends ColorBlock
{
    // instance variables - replace the example below with your own
    
    Maze theMaze=(Maze)grid();

    /**
     * Constructor for objects of class Mouse
     */
    public Mouse()
    {
        
        super(new NamedColor(Color.LIGHT_GRAY));
    }
    
    public void move()
    {Location CheeseLoc = theMaze.finishLoc; 
        Location nextLoc = nextLocation();
    
        if(!location().equals(CheeseLoc)){ 
            if(CheeseLoc.equals(nextLoc)){ 
                grid().remove(CheeseLoc);
            }
            
            changeLocation(nextLoc);

             
            if(location().equals(CheeseLoc)){ 
                System.out.println("Finished: number of steps taken was " );
                return;
            }
        }

        return;
    
    }


protected ArrayList<Location> emptyNeighbors()
    {
        
        ArrayList<Location> nbrs = grid().neighborsOf(location());

        
        ArrayList<Location> emptyNbrs = new ArrayList<Location>();
        for ( Location loc : nbrs )
        {
            if ( grid().isEmpty(loc) || theMaze.finishLoc.equals(loc))
                emptyNbrs.add(loc);
        }

        return emptyNbrs;
    }

    public Location nextLocation()
    {
        Location newLoc = this.location(); 

        return newLoc;
    }
} 
    