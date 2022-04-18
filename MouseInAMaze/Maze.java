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
import edu.kzoo.grid.BoundedGrid;
/**
 * This is the code to create a maze for the mice to find the cheese in.
 *
 * @author Raymond Ribaudo
 * @version 3/9/2022
 */
public class Maze extends BoundedGrid
{
    // instance variables - replace the example below with your own
    protected static Location startLoc; 
    protected static Location finishLoc;
    

    /**
     * Constructor for objects of class Maze
     */
    public Maze(int rows, int cols )
    {
        // initialise instance variables
        super(rows, cols);
    }

    public void setStartLoc(Location loc)
    {startLoc = loc;
    
    }
    
    public void setFinishLoc(Location loc)
    {finishLoc = loc;
    
    }
    /**
     * Returns the starting location of the mouse
     */
    public Location getStartLoc()
    {
        return startLoc;
    }

    /**
     * Returns the finish/chesse location
     */
    public Location getFinishLoc()
    {
        return finishLoc;
    }
    

    
    }
