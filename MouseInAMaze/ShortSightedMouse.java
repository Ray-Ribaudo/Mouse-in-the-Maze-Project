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
 * This Mouse cant see too far away, it is like the clueless mouse and will move randomly unless the cheese is right in front of it.
 *
 * @author Raymond Ribaudo
 * @version 3/12/2022
 */
public class ShortSightedMouse extends Mouse
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class ShortSightedMouse
     */
    public ShortSightedMouse()
    {    
        super();
    }

    /**
     * This checks if the mouse can see the cheese when it is in front of it by two blocks.
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean IsThisDirCheese(Direction choosenDir)
    {
        Location initialLocation = this.location(); //just to make code easier to read

        Location oneAhead = grid().getNeighbor(initialLocation, choosenDir); //one location ahead is set to oneAhead

        if(oneAhead.equals(theMaze.finishLoc)){ 
            return true; 
        }else if(grid().isEmpty(oneAhead)){
            Location twoAhead = grid().getNeighbor(oneAhead, choosenDir);  
            if(twoAhead.equals(theMaze.finishLoc)){ 
                return true; 
            }
        }
        return false; 
    }

    /**
     * This will return the cheese if it is in sight by two blocks
     */
    public Direction CheckAllCheeseDir()
    {
        if(IsThisDirCheese(Direction.NORTH)){
            return Direction.NORTH;
        }
        else if(IsThisDirCheese(Direction.EAST)){
            return Direction.EAST;
        }
        else if(IsThisDirCheese(Direction.SOUTH)){
            return Direction.SOUTH;
        }
        else if(IsThisDirCheese(Direction.WEST)){
            return Direction.WEST;
        }
        return null;
    }

    /**
     * This bit of code determines the next location for the mouse
     */
    public Location nextLocation()
    {
        Direction cheeseDir = CheckAllCheeseDir(); 

        if (cheeseDir == null){ 
            ArrayList<Location> emptyNbrs= emptyNeighbors();

            
            Random randNumGen = RandNumGenerator.getInstance();
            int randNum = randNumGen.nextInt(emptyNbrs.size());

            return emptyNbrs.get(randNum);
        }
        else{ 
            return grid().getNeighbor(this.location(), cheeseDir);
        }
    }

}
        

