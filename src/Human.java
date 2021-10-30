public class Human extends Character{
    private int Coins;

    public Human(){
        Name = "";
        MaxHealth = 0.0;
        RemHealth = 0.0;
        Coins = 0;
    }

    public Human(String Name, double MaxHealth, double RemHealth, int Coins){
        this.Name = Name;
        this.MaxHealth = MaxHealth;
        this.RemHealth = RemHealth;
        this.Coins = Coins;
    }

    public int getCoins(){
        return Coins;
    }

    public void setCoins(int Coins){
        this.Coins = Coins;
    }

    @Override
    public String toString(){
        return "Human " + Name + ": " + RemHealth + " out of " + MaxHealth + " or " + getHealthPercentage() + "% and " + Coins + "coins.";
    }
}
