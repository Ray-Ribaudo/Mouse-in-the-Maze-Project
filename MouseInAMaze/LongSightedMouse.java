import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import edu.kzoo.grid.Grid;
import edu.kzoo.grid.ColorBlock;
import edu.kzoo.grid.BoundedGrid;
import edu.kzoo.grid.GridObject;
import edu.kzoo.grid.Location;
import edu.kzoo.grid.Direction;
import edu.kzoo.util.Debug;
import edu.kzoo.util.NamedColor;
import edu.kzoo.util.RandNumGenerator;
/**
 * This Mouse has the best eyesight out of the mice and can see far far away.
 *
 * @author Raymond Ribaudo
 * @version 3/12/2022
 */
public class LongSightedMouse extends ShortSightedMouse
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class LongSightedMouse
     */
    public LongSightedMouse()
    {
        super();
    }

    public boolean IsThisDirCheese(Direction choosenDir)
    {
        Location initialLocation = this.location(); 
        Location cellAhead = grid().getNeighbor(initialLocation, choosenDir); 

        
        while(grid().isValid(cellAhead) && (grid().isEmpty(cellAhead) || cellAhead.equals(theMaze.finishLoc) )) 
        
        {
            

            if(cellAhead.equals(theMaze.finishLoc)){ 
                return true;
            }
            else{ 
                cellAhead = grid().getNeighbor(cellAhead, choosenDir);  
                
            
            }

        }

        return false;
    }
}

