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
 * This Mouse teleports directly to the cheese.
 *
 * @author Raymond Ribaudo
 * @version 3/12/2022
 */
public class BeamMeUpMouse extends Mouse
{
    // instance variables - replace the example below with your own
    

    /**
     * This bit of code tells the BeamMeUpMouse where the cheese is exactly
     */
    public BeamMeUpMouse()
    {
        super();
    
    }

    public Location nextLocation()
    {
        Location newLoc = theMaze.finishLoc;
        
        return newLoc;
    }
    
}
