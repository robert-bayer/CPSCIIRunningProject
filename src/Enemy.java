public class Enemy extends Character{

    public Enemy(){
        Name = "";
        MaxHealth = 0.0;
        RemHealth = 0.0;
    }

    public Enemy(String Name, double MaxHealth, double RemHealth){
        this.Name = Name;
        this.MaxHealth = MaxHealth;
        this.RemHealth = RemHealth;
    }

    @Override
    public String toString(){
        return "Enemy " + Name + ": " + RemHealth + " out of " + MaxHealth + " or " + getHealthPercentage() + "%";
    }
}
