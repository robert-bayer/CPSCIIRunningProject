/**
 * This class is the enemy class and overrides methods specific to it.  It is inheriting the abstract class Character
 *
 * @author Robert Bayer
 * @version 0.1
 * @date 11/1/21
 *
 */

public class Enemy extends Character{

    /**
     * An empty constructor
     */
    public Enemy(){
        Name = "";
        MaxHealth = 0.0;
        RemHealth = 0.0;
    }

    /**
     * Constructor taking all parameters
     * @param Name Name of the Character
     * @param MaxHealth Maximum health of the character
     * @param RemHealth Remaining health of the character
     */
    public Enemy(String Name, double MaxHealth, double RemHealth){
        this.Name = Name;
        this.MaxHealth = MaxHealth;
        this.RemHealth = RemHealth;
    }

    /**
     * Overriding the Java.lang.String toString method
     * @return All pertinent information of the Character
     */
    @Override
    public String toString(){
        return "Enemy " + Name + ": " + Math.round(RemHealth * 10.0) / 10.0 + " out of " + Math.round(MaxHealth * 10.0) / 10.0 + " or " + getHealthPercentage() + "%";
    }
}
