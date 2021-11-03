/**
 * This class is the Enemy Boss class and contains and overrides methods specific to it.  It is inheriting the Enemy class.
 *
 * @author Robert Bayer
 * @version 0.1
 * @date 11/1/21
 *
 */
public class EnemyBoss extends Enemy{

    private int Lives;

    /**
     * An empty constructor
     */
    public EnemyBoss() {
        Name = "";
        MaxHealth = 0.0;
        RemHealth = 0.0;
        Lives = 0;
    }

    /**
     * Constructor taking all parameters
     * @param Name Name of the Character
     * @param MaxHealth Maximum health of the character
     * @param RemHealth Remaining health of the character
     * @param Lives Lives the character has
     */
    public EnemyBoss(String Name, double MaxHealth, double RemHealth, int Lives){
        this.Name = Name;
        this.MaxHealth = MaxHealth;
        this.RemHealth = RemHealth;
        this.Lives = Lives;
    }

    /**
     * Accessor for Lives
     * @return Lives of character
     */
    public int getLives(){
        return Lives;
    }

    /**
     * Mutator of Lives
     * @param Lives desired amount of Lives
     */
    public void setLives(int Lives){
        this.Lives = Lives;
    }

    /**
     * Overriding the Java.lang.String toString method
     * @return All pertinent information of the Character
     */
    @Override
    public String toString(){
        return "Enemy Boss " + Name + ": " + Math.round(RemHealth * 10.0) / 10.0 + " out of " + Math.round(MaxHealth * 10.0) / 10.0 + " or " + getHealthPercentage() + "% and " + Lives + " left";
    }
}
