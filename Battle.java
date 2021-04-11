import java.util.ArrayList;

/**
 * Write a description of class Battle here.
 *
 * @author Steven Fabian
 * @version 2021/11/04
 */
public class Battle
{
    // instance variables - replace the example below with your own
    private ArrayList<Creature> goodArmy = new ArrayList<Creature>();
    private ArrayList<Creature> evilArmy = new ArrayList<Creature>();

    private Randomizer s = new Randomizer();
    /**
     * Constructor for objects of class Battle
     */
    public Battle() {
        CreateGoodArmy(100);
        CreateEvilArmy(50);
        Fight();
    }

    private void  CreateGoodArmy(int numberOfSoldiers) {
        for (int i = 0; i < numberOfSoldiers; i++) {
            int temp = Randomizer.nextInt(10);
            if (temp < 6) {
                goodArmy.add(new Human());
            } else if (temp < 8){
                goodArmy.add(new Elf());
            }
            else{
                goodArmy.add(new Angel());
                System.out.println("GOD HAS SENT AN ANGEL! ");
            }
        }   
    }
    
    private void  CreateEvilArmy(int numberOfSoldiers) 
    {
        for (int i = 0; i < numberOfSoldiers; i++) {
            int temp = Randomizer.nextInt(25);
            if (temp < 18) {
                evilArmy.add(new Human());
            } else if (temp < 22) {
                evilArmy.add(new CyberDemon());
            } else {
                evilArmy.add(new Balrog());
                System.out.println("The Balrog has been summoned");
            }
        }
    }   
    
    public void Fight() 
    {       
        Creature goodWarrior=null;
        Creature evilWarrior=null;
        boolean goodAlive = false;
        boolean evilAlive = false;
        
        do {
            System.out.println("--------");
            if ((goodWarrior == null) && (goodArmy.size() > 0)) {goodWarrior = goodArmy.remove(0); goodAlive = goodWarrior.isAlive();}
            if ((evilWarrior == null) && (evilArmy.size() > 0)) {evilWarrior = evilArmy.remove(0); evilAlive = evilWarrior.isAlive();}
            while (goodWarrior.isAlive() && evilWarrior.isAlive()){
                evilWarrior.takeDamage(goodWarrior.attack());
                goodWarrior.takeDamage(evilWarrior.attack());
                String s= "\t";
                s += goodWarrior.getClass();
                s += (goodWarrior.isAlive()? " is standing (":" is dead (");
                s += ("HP: " + goodWarrior.getHp() + ")");
                s += "\t" + "::" + "\t";
                s += evilWarrior.getClass();
                s += (evilWarrior.isAlive()? " is standing (":" is dead (");
                s += ("HP: " + evilWarrior.getHp() + ")");
                System.out.println(s);
            }
            if(goodWarrior.isKnockedOut()) {goodAlive = goodWarrior.isAlive(); goodWarrior = null;}
            if(evilWarrior.isKnockedOut()) {evilAlive = evilWarrior.isAlive(); evilWarrior = null;}
            System.out.println("Good: " + goodArmy.size() + "\t::\t" + "Evil: " + evilArmy.size());
                
        } while ((goodArmy.size() > 0 && evilArmy.size() > 0) || ((goodArmy.size() > 0 && evilAlive) || (evilArmy.size() > 0 && goodAlive)));
        
        if (goodArmy.size() > 0) {
            System.out.println ("-----------------------------");
            System.out.println ("The GOOD ARMY ARE THE VICTORS! "); 
            System.out.println ("-----------------------------");
        } else if (evilArmy.size() > 0) {
            System.out.println("-----------------");
            System.out.println ("THE EVIL NATION ARE VICTORIOUS! ");
            System.out.println("-----------------");
        } else {
            System.out.println("-------------------------");
            System.out.println("GAME OVER!");
            System.out.println("-------------------------");
        }                
    }
}
