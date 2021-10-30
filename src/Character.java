public abstract class Character {
    protected String Name;
    protected double MaxHealth;
    protected double RemHealth;
    protected double Modifier;

    public Character(){
        Name = "";
        MaxHealth = 0.0;
        RemHealth = 0.0;
    }

    public Character(String Name, double MaxHealth, double RemHealth){
        this.Name = Name;
        this.MaxHealth = MaxHealth;
        this.RemHealth = RemHealth;
    }

    public String getName(){
        return Name;
    }

    public double getMaxHealth(){
        return MaxHealth;
    }

    public double getRemHealth(){
        return RemHealth;
    }

    public double getModifier(){
        return Modifier;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public void setMaxHealth(double MaxHealth){
        this.MaxHealth = MaxHealth;
    }

    public void setRemHealth(double RemHealth){
        this.RemHealth = RemHealth;
    }

    public void setModifier(double Modifier){
        this.Modifier = Modifier;
    }

    public double getHealthPercentage() {
        return Math.round(((getRemHealth() / getMaxHealth()) * 100) * 10.0) / 10.0;
    }

    public abstract String toString();


}
