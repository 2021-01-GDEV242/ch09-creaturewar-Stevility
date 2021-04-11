

/**
 * The Demon class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [20/5]
 * Implements a maximum/minimum hitpoint total for the creature type [25/5]
 * 
 * @author Steven Fabian
 * @version 2021/11/04
 */
public class Demon extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_DEMON_HP = 100;
    private static final int MIN_DEMON_HP = 50;
    private static final int MAX_DEMON_STR = 75;
    private static final int MIN_DEMON_STR = 25;

    /**
     * Constructor for objects of class Demon -
     * Note that the calling class does not need to know anything about the 
     * requirements of human minimum and maximum values
     * 
     * The instantiating class asks for a Demon and the human class is responsible for
     * return a Demon object with values in the appropriate range
     * 
     */
    public Demon()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_DEMON_HP-MIN_DEMON_HP)+MIN_DEMON_HP,    
            Randomizer.nextInt(MAX_DEMON_STR-MIN_DEMON_STR)+MIN_DEMON_STR
        );
          
    }
    
    public Demon(int str, int hp) 
    {
        super(str, hp);
    }
    
    public int attack() 
    {
        int tempattack;
        tempattack = super.attack();
        
        if (Randomizer.nextInt(20) == 0) {
            System.err.println("OVER 9000!");
            tempattack += 50;
        }
        
        return tempattack;
    }
}
