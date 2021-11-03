/**
 * This class is the human class and contains and overrides methods specific to it.  It is inheriting the abstract class Character
 *
 * @author Robert Bayer
 * @version 0.1
 * @date 11/1/21
 *
 */

public class Human extends Character{
    private int Coins;

    /**
     * An empty constructor
     */
    public Human(){
        Name = "";
        MaxHealth = 0.0;
        RemHealth = 0.0;
        Coins = 0;
    }

    /**
     * Constructor taking all parameters
     * @param Name Name of the Character
     * @param MaxHealth Maximum health of the character
     * @param RemHealth Remaining health of the character
     * @param Coins Coins the character has
     */
    public Human(String Name, double MaxHealth, double RemHealth, int Coins){
        this.Name = Name;
        this.MaxHealth = MaxHealth;
        this.RemHealth = RemHealth;
        this.Coins = Coins;
    }

    /**
     * Accessor for coins
     * @return coins of character
     */
    public int getCoins(){
        return Coins;
    }

    /**
     * Mutator of coins
     * @param Coins desired amount of coins
     */
    public void setCoins(int Coins){
        this.Coins = Coins;
    }


    /**
     * Overriding the Java.lang.String toString method
     * @return All pertinent information of the Character
     */
    @Override
    public String toString(){
        return "Human " + Name + ": " + Math.round(RemHealth * 10.0) / 10.0 + " out of " + Math.round(MaxHealth * 10.0) / 10.0 + " or " + getHealthPercentage() + "% and " + Coins + " coins.";
    }
}
