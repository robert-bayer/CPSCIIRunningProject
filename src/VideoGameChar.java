/**
 *
 * The following program is a basic Video Game Character data tracker.
 * <p>
 * It can take is multiple @param including the Name, Max Health, and Remaining Health
 * </p>
 * @version 0.2.7
 * @author Robert Bayer
 * @date 09/11/2021
 *
 */

public class VideoGameChar {
    private String Name;
    private double MaximumHealth;
    private double RemainingHealth;
    private int Level = 0;

    /**
     * Empty Constructor
     */
    public VideoGameChar() {
        Name = "";
        MaximumHealth = 0.0;
        RemainingHealth = 0.0;
    }

    /**
     * Constructor with all variables
     */
    public VideoGameChar(String Name, double MaxHealth, double RemainingHealth) {
        this.Name = Name;
        MaximumHealth = MaxHealth;
        this.RemainingHealth = RemainingHealth;
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
    public double getHealthPercentage() {
        //System.out.println("Calculating Percentage...");
        return Math.round(((getRemainingHealth() / getMaxHealth()) * 100) * 10.0) / 10.0;
    }

    //The Following Code Will Calculate and Return all relevant data to the Character.

    /**
     * Displays all relevant data of the character
     * @return A String of all pertinent information
     */
    public String toString() {
        return Name + ": " + Math.round(getRemainingHealth() * 10.0) / 10.0 + " out of " + Math.round(getMaxHealth() * 10.0) / 10.0 + " health or " + getHealthPercentage() + "%";


    }

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
     * A method to test if the given unit is suitable to be made the Max Health
     * @param TestUnit Unit that has been proposed to be the maximum health
     * @return true if the proposed max health is greater than 0.0
     */
    public boolean testMaxHealth(double TestUnit){
        return TestUnit > 0.0;
    }

    /**
     * A method to test if the given unit is between 0.0 and Maximum Health, used in both setting remaining health and modifying
     * @param TestUnit Unit that is being proposed to be used to set Remaining Health of modify it
     * @return true if unit is between 0.0 and Maximum Health
     */
    public boolean testRemainingHealth(double TestUnit){
        return TestUnit >= 0.0 && TestUnit <= getMaxHealth();
    }

    /**
     * A method to test if the requested change is legal
     * @param TestOperator the requested change
     * @return true if the requested change is to add or subtract health to/from the remaining health
     */
    public boolean testOperator(String TestOperator){
        return TestOperator.equals("add") || TestOperator.equals("sub");
    }

    /**
     * A method to test if the requested amount of iterations is legal
     * @param TestUnit The amount of requested iterations
     * @return true if the amount of requested iterations are between 1 and 10 (inclusive)
     */
    public boolean testIteration(int TestUnit){
        return TestUnit <= 10 && TestUnit > 0;
    }

    /**
     * States a phrase describing the amount of health left using the percentage
     * @param HealthPercentage The percentage of health remaining
     * @return The respective phrase depending on the percentage
     */
    public String getHealthPhrase(double HealthPercentage){
        if(HealthPercentage == 0.0){
            return "Health all gone";
        }
        else if(HealthPercentage > 0.0 && HealthPercentage <= 25.0){
            return "Health almost gone (" + getHealthPercentage() + "%)";
        }
        else if(HealthPercentage > 25.0 && HealthPercentage <= 50.0){
            return "More than a quarter health remaining (" + getHealthPercentage() + "%)";
        }
        else if(HealthPercentage > 50.0 && HealthPercentage < 100.0){
            return "More than half health remaining (" + getHealthPercentage() + "%)";
        }
        else{
            return "Full health remaining";
        }
    }

    /**
     * A method to increase the health by a given amount by a given amount of times
     * @param healthModifier the amount that will be added per iteration
     * @param iterations the amount of times that the amount will be added
     */
    public void increaseHealth(double healthModifier, int iterations){
        for(int i = 0; i < iterations; i++){
            System.out.println("Iteration " + (i+1));
            if(getRemainingHealth() + healthModifier <= getMaxHealth()) {
                RemainingHealth += healthModifier;
            }
            else{
                setRemainingHealth(getMaxHealth());
            }
            System.out.println(getHealthPhrase(getHealthPercentage()));
        }
    }

    /**
     * A method to decrease a given amount of health a given amount of times.
     * @param healthModifier the amount that will be subtracted per iteration
     * @param iterations the amount of times that the amount will be subtracted
     */
    public void decreaseHealth(double healthModifier, int iterations){
        for(int i = 0; i < iterations; i++){
            System.out.println("Iteration " + (i+1));
            if(getRemainingHealth() - healthModifier >= 0) {
                RemainingHealth -= healthModifier;
            }
            else {
                setRemainingHealth(0.0);
            }
            System.out.println(getHealthPhrase(getHealthPercentage()));
        }
    }
}