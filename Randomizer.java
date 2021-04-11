import java.util.Random;

/**
 * A static utility class Singleton that maps random number generation 
 * from the range 0..limit -1
 * to the range 1..limit
 * 
 * @author Steven Fabian
 * @version 2021/11/04
 */
public class Randomizer
{
    private static Random rand;


    /**
     * The constructor for the classes.
     */
    public Randomizer ()
    {
        rand = new Random();
    }
    
    /**
     * Returns an int.
     */
    public static int nextInt(int x)
    {
        return rand.nextInt(x);
    }
}
