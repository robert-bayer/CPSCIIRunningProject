public class EnemyBoss extends Enemy{

    private int Lives;

    public EnemyBoss() {
        Name = "";
        MaxHealth = 0.0;
        RemHealth = 0.0;
        Lives = 0;
    }

    public EnemyBoss(String Name, double MaxHealth, double RemHealth, int Lives){
        this.Name = Name;
        this.MaxHealth = MaxHealth;
        this.RemHealth = RemHealth;
        this.Lives = Lives;
    }

    public int getLives(){
        return Lives;
    }

    public void setLives(int Lives){
        this.Lives = Lives;
    }

    @Override
    public String toString(){
        return "Enemy Boss" + Name + ": " + RemHealth + " out of " + MaxHealth + " or " + getHealthPercentage() + "% and" + Lives + "left";
    }
}
