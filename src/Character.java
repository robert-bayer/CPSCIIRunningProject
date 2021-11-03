/**
 * The abstract class that all other characters are based off of.  toString is an abstract class to be defined by each class.
 *
 * @author Robert Bayer
 * @version 0.1
 * @date 11/1/21
 *
 */


public abstract class Character {
    protected String Name;
    protected double MaxHealth;
    protected double RemHealth;
    protected double Modifier;

    /**
     * Empty constructor
     */
    public Character(){
        Name = "";
        MaxHealth = 0.0;
        RemHealth = 0.0;
    }

    /**
     *
     * @param Name Name of Character
     * @param MaxHealth Max Health of Character
     * @param RemHealth Remaining Health of Character
     */
    public Character(String Name, double MaxHealth, double RemHealth){
        this.Name = Name;
        this.MaxHealth = MaxHealth;
        this.RemHealth = RemHealth;
    }

    /**
     * Accessor of Name
     * @return Name
     */
    public String getName(){
        return Name;
    }

    /**
     * Accessor of Max Health
     * @return Max Health
     */
    public double getMaxHealth(){
        return MaxHealth;
    }

    /**
     * Accessor of Remaining Health
     * @return Remaining Health
     */
    public double getRemHealth(){
        return RemHealth;
    }

    /**
     * Accessor of Health Modifier
     * @return Health Modifier
     */
    public double getModifier(){
        return Modifier;
    }

    /**
     * Mutator of Name
     * @param Name Characters Name
     */
    public void setName(String Name){
        this.Name = Name;
    }

    /**
     * Mutator of Max Health
     * @param MaxHealth Characters Max Health
     */
    public void setMaxHealth(double MaxHealth){
        this.MaxHealth = MaxHealth;
    }

    /**
     * Mutator of Remaining Health
     * @param RemHealth Characters Remaining Health
     */
    public void setRemHealth(double RemHealth){
        this.RemHealth = RemHealth;
    }

    /**
     * Mutator of Health Modifier
     * @param Modifier Characters Health Modifier
     */
    public void setModifier(double Modifier){
        this.Modifier = Modifier;
    }

    /**
     * Gets the percentage of health remaining
     * @return Percentage of Health remaining
     */
    public double getHealthPercentage() {
        return Math.round(((getRemHealth() / getMaxHealth()) * 100) * 10.0) / 10.0;
    }

    /**
     * Increases the Remaining Health by the given health modifier
     */
    public void increaseHealth() {
        if (RemHealth + Modifier < MaxHealth) {
            RemHealth += Modifier;
        } else {
            RemHealth = MaxHealth;
        }
    }

    /**
     * Decreases the Remaining Health by the given health modifier
     */
    public void decreaseHealth(){
        if(RemHealth - Modifier > 0) { RemHealth -= Modifier; }
        else { RemHealth = 0.0 ; }
    }

    /**
    public boolean compareTo(String Name){
        if(this.Name == Name){
            return true;
        }
        else{
            return false;
        }
    }
    */

    public abstract String toString();

}
