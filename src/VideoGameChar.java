/**
 *
 * The following program is a basic Video Game Character data tracker.
 * <p>
 * It can take is multiple @param including the Name, Max Health, and Remaining Health
 * NOTE: THIS GOES WITH THE MORE EFFICIENT AND CLEANER VIDEO GAME CHAR HEALTH DRIVER
 * </p>
 * @version 0.2.7
 * @author Robert Bayer
 * @date 09/11/2021
 *
 */
import java.util.ArrayList;

public class VideoGameChar{
    private String Name;
    private double MaximumHealth;
    private double RemainingHealth;
    private int Level = 0;
    private String Operator;
    private double Modifier;
    private int Iterations;

    /**
     * Empty Constructor
     */
    public VideoGameChar() {
        Name = "";
        MaximumHealth = 0.0;
        RemainingHealth = 0.0;
        Level = 0;
        Operator = "";
        Modifier = 0.0;
        Iterations = 0;
    }

    /**
     * Constructor with all variables
     */
    public VideoGameChar(String Name, double MaxHealth, double RemainingHealth, String Operator, double Modifier, int Iterations) {
        this.Name = Name;
        MaximumHealth = MaxHealth;
        this.RemainingHealth = RemainingHealth;
        this.Operator = Operator;
        this.Modifier = Modifier;
        this.Iterations = Iterations;
    }

    /**
     * Accessor of the "Name" field.
     * @return Name of the character
     */
    public String getName() {
        return Name;
    }

    /**
     * Accessor of the "MaximumHealth" field.
     * @return Maximum Health of the Character
     */
    public double getMaxHealth() {
        return MaximumHealth;
    }

    /**
     * Accessor of the "RemainingHealth" field.
     * @return Remaining Health of the Character
     */
    public double getRemainingHealth() {
        return RemainingHealth;
    }

    /**
     * Mutator of the "Name" field.
     * @param Name Name you want the Character to be
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Mutator of the "MaximumHealth" field.
     * @param MaximumHealth The Maximum health you want the Character to have
     */
    public void setMaxHealth(double MaximumHealth) {
        this.MaximumHealth = MaximumHealth;
    }

    /**
     * Mutator of the "RemainingHealth" field.
     * @param RemainingHealth The Remaining health you want the Character to have
     */
    public void setRemainingHealth(double RemainingHealth) {
        this.RemainingHealth = RemainingHealth;
    }

    /**
     * Calculates and Returns the Percentage Health Remaining
     * @return The Percentage of Maximum Health that is Remaining
     */
    public double getHealthPercentage() { return Math.round(((getRemainingHealth() / getMaxHealth()) * 100) * 10.0) / 10.0; }

    /**
     * Accessor to the "Operator" field.
     * @return The operator entered
     */
    public String getOperator(){
        return Operator;
    }

    /**
     * Mutator for the "Operator" field
     * @param Operator is the entered operator
     */
    public void setOperator(String Operator){
        this.Operator = Operator;
    }

    /**
     * Mutator for the "Modifier" field
     * @param Modifier Amount added or subtracted
     */
    public void setModifier(double Modifier) { this.Modifier = Modifier; }

    /**
     * Accessor for the "Modifier" field
     * @return The amount of health being added or subtracted
     */
    public double getModifier() { return Modifier; }

    /**
     * Accessor for the "Iterations" field
     * @return The amount of iterations wanted
     */
    public int getIterations() { return Iterations; }

    /**
     * Mutator for the "Iterations field
     * @param Iterations Number of times added or subtracted
     */
    public void setIterations(int Iterations) { this.Iterations = Iterations; }

    //The Following Code Will Calculate and Return all relevant data to the Character.

    /**
     * Displays all relevant data of the character
     * @return A String of all pertinent information
     */
    public String toString() { return Name + ": " + Math.round(getRemainingHealth() * 10.0) / 10.0 + " out of " + Math.round(getMaxHealth() * 10.0) / 10.0 + " health or " + getHealthPercentage() + "%"; }

    /**
     * Custom method setting the level of the character
     * @param Level Level you want to set the Character to
     */
    public void setLevel(int Level) {
        this.Level = Level;
    }

    /**
     * Custom method getting the level of the character
     * @return Level of the Character
     */
    public int getLevel() {
        return Level;
    }

    /**
     * States a phrase describing the amount of health left using the percentage
     * @return The respective phrase depending on the percentage
     */
    public String getHealthPhrase(){
        if(getHealthPercentage() == 0.0){ return "Health all gone"; }
        else if(getHealthPercentage() > 0.0 && getHealthPercentage() <= 25.0){ return "Health almost gone (" + getHealthPercentage() + "%)"; }
        else if(getHealthPercentage() > 25.0 && getHealthPercentage() <= 50.0){ return "More than a quarter health remaining (" + getHealthPercentage() + "%)"; }
        else if(getHealthPercentage() > 50.0 && getHealthPercentage() < 100.0){ return "More than half health remaining (" + getHealthPercentage() + "%)"; }
        else{ return "Full health remaining"; }
    }

    /**
     * A method to increase the health by a given amount by a given amount of times
     * @param healthModifier the amount that will be added per iteration
     */
    public void increaseHealth(double healthModifier){
        if(RemainingHealth + healthModifier < getMaxHealth()) { RemainingHealth += healthModifier; }
        else{ setRemainingHealth(MaximumHealth); }
    }

    /**
     * A method to decrease a given amount of health a given amount of times.
     * @param healthModifier the amount that will be subtracted per iteration
     */
    public void decreaseHealth(double healthModifier){
        if(RemainingHealth - healthModifier > 0) { RemainingHealth -= healthModifier; }
        else { setRemainingHealth(0.0); }
    }
}
