

/**
 * The Angel class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [20/5]
 * Implements a maximum/minimum hitpoint total for the creature type [25/5]
 * 
 * @author Steven Fabian
 * @version 2021/11/04
 */
public class Angel extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_ANGEL_HP = 70;
    private static final int MIN_ANGEL_HP = 30;
    private static final int MAX_ANGEL_STR = 50;
    private static final int MIN_ANGEL_STR = 40;

    /**
     * Constructor for objects of class Angel -
     * Note that the calling class does not need to know anything about the 
     * requirements of human minimum and maximum values
     * 
     * The instantiating class asks for a Angel and the human class is responsible for
     * return a Angel object with values in the appropriate range
     * 
     */
    public Angel()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_ANGEL_HP-MIN_ANGEL_HP)+MIN_ANGEL_HP,    
            Randomizer.nextInt(MAX_ANGEL_STR-MIN_ANGEL_STR)+MIN_ANGEL_STR
        );
          
    }
    
    
    // attack() - not overridden because Humans generate basic damage
    // takeDamage(int) - not overridden, because Humans take all damage assigned to them

    
}
