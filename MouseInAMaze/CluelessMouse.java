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
 * This Mouse is clueless and cant find the cheese no matter what. It moves randomly.
 *
 * @author Raymond Ribaudo
 * @version 3/12/2022
 */
public class CluelessMouse extends Mouse
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class CluelessMouse
     */
    public CluelessMouse()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Location nextLocation()
    
    {
        ArrayList<Location> emptyNbrs= emptyNeighbors();

        
        Random randNumGen = RandNumGenerator.getInstance();
        int randNum = randNumGen.nextInt(emptyNbrs.size());
        
        System.out.println(emptyNbrs.get(randNum));
        return emptyNbrs.get(randNum);
        
    }
}
