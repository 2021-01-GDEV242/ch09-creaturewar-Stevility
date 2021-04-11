

/**
 * The CyberDemon class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [20/5]
 * Implements a maximum/minimum hitpoint total for the creature type [25/5]
 * 
 * @author Steven Fabian
 * @version 2021/11/04
 */
public class CyberDemon extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_CYBERDEMON_HP = 100;
    private static final int MIN_CYBERDEMON_HP = 25;
    private static final int MAX_CYBERDEMON_STR = 40;
    private static final int MIN_CYBERDEMON_STR = 20;
    
    public CyberDemon()
    {
        super();
    }
}
