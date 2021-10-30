import java.util.Scanner;
import java.util.ArrayList;

public class VideoGameCharManager {

    public static void main(String[] args){

        Scanner stdinScanner = new Scanner(System.in);
        ArrayList<Character> Characters = new ArrayList<>();
        int pointer;
        String stringPointer;
        int intPointer;
        double doublePointer;

        System.out.println("Welcome to your VideoGameChar Manager\nto store all of the video game characters");

        do{
            System.out.println("Options:\n1) Add a human character\n2) Add an enemy character\n3) Add an enemy boss character\n4) Display a character\n5) Display all characters\n6) Remove a character\n7) Increase a character's health\n8) Decrease a character's health\n9) Quit");
            System.out.print("Please choose from the above options: ");
            pointer = stdinScanner.nextInt();
            System.out.println("You entered: " + pointer);

            //INPUTTING AN INCORRECT OPTION
            if(stdinScanner.nextInt() > 9 || stdinScanner.nextInt() < 1){
                System.out.println("I'm sorry, that's not an option, please try again.");
            }



            //CREATING A HUMAN
            else if(pointer == 1){
                Human human = new Human();
                System.out.println("Please enter the name of the human character: ");
                human.setName(stdinScanner.next());
                System.out.println("You entered: " + human.getName());

                //GETTING THE MAX HEALTH
                do{
                    System.out.print("Enter " + human.getName()+  "'s max health: ");
                    human.setMaxHealth(stdinScanner.nextDouble());
                    System.out.println("You entered: " + human.getMaxHealth());
                    if(human.getMaxHealth() <= 0.0){
                        System.out.println(human.getName()+ "'s max health must be greater than 0.0.");
                    }
                }
                while(human.getMaxHealth() <= 0);

                //GETTING THE REMAINING HEALTH
                do {
                    System.out.print("Enter " + human.getName() + "'s remaining health: ");
                    human.setRemHealth(stdinScanner.nextDouble());
                    System.out.println("You entered: " + human.getRemHealth());
                    if (human.getRemHealth() < 0 || human.getRemHealth() > human.getMaxHealth()) {
                        System.out.println(human.getName() + "'s remaining health must be greater than 0.0 and less than max health (" + human.getMaxHealth() + ").");
                    }
                }
                while(human.getRemHealth() < 0 || human.getRemHealth() > human.getMaxHealth());

                //GETTING THE COINS
                do{
                    System.out.print("Enter the amount of coins for " + human.getName());
                    human.setCoins(stdinScanner.nextInt());
                    System.out.println("You entered: " + human.getCoins());
                    if (human.getCoins() < 0) {
                        System.out.println("Number of coins must be greater tha 0");
                    }
                }
                while(human.getCoins() < 0);

                //ADDING HUMAN TO ARRAYLIST
                Characters.add(human);
            }




            //CREATING AN ENEMY
            else if(pointer == 2){

                Enemy enemy = new Enemy();
                System.out.println("Please enter the name of the enemy boss character: ");
                enemy.setName(stdinScanner.next());
                System.out.println("You entered: " + enemy.getName());

                //GETTING THE MAX HEALTH
                do{
                    System.out.print("Enter " + enemy.getName()+  "'s max health: ");
                    enemy.setMaxHealth(stdinScanner.nextDouble());
                    System.out.println("You entered: " + enemy.getMaxHealth());
                    if(enemy.getMaxHealth() <= 0.0){
                        System.out.println(enemy.getName()+ "'s max health must be greater than 0.0.");
                    }
                }
                while(enemy.getMaxHealth() <= 0);

                //GETTING THE REMAINING HEALTH
                do {
                    System.out.print("Enter " + enemy.getName() + "'s remaining health: ");
                    enemy.setRemHealth(stdinScanner.nextDouble());
                    System.out.println("You entered: " + enemy.getRemHealth());
                    if (enemy.getRemHealth() < 0 || enemy.getRemHealth() > enemy.getMaxHealth()) {
                        System.out.println(enemy.getName() + "'s remaining health must be greater than 0.0 and less than max health (" + enemy.getMaxHealth() + ").");
                    }
                }
                while(enemy.getRemHealth() < 0 || enemy.getRemHealth() > enemy.getMaxHealth());

                //ADDING enemy TO ARRAYLIST
                Characters.add(enemy);
            }



            else if(pointer == 3){

                EnemyBoss enemyBoss = new EnemyBoss();
                System.out.println("Please enter the name of the enemy boss character: ");
                enemyBoss.setName(stdinScanner.next());
                System.out.println("You entered: " + enemyBoss.getName());

                //GETTING THE MAX HEALTH
                do{
                    System.out.print("Enter " + enemyBoss.getName()+  "'s max health: ");
                    enemyBoss.setMaxHealth(stdinScanner.nextDouble());
                    System.out.println("You entered: " + enemyBoss.getMaxHealth());
                    if(enemyBoss.getMaxHealth() <= 0.0){
                        System.out.println(enemyBoss.getName()+ "'s max health must be greater than 0.0.");
                    }
                }
                while(enemyBoss.getMaxHealth() <= 0);

                //GETTING THE REMAINING HEALTH
                do {
                    System.out.print("Enter " + enemyBoss.getName() + "'s remaining health: ");
                    enemyBoss.setRemHealth(stdinScanner.nextDouble());
                    System.out.println("You entered: " + enemyBoss.getRemHealth());
                    if (enemyBoss.getRemHealth() < 0 || enemyBoss.getRemHealth() > enemyBoss.getMaxHealth()) {
                        System.out.println(enemyBoss.getName() + "'s remaining health must be greater than 0.0 and less than max health (" + enemyBoss.getMaxHealth() + ").");
                    }
                }
                while(enemyBoss.getRemHealth() < 0 || enemyBoss.getRemHealth() > enemyBoss.getMaxHealth());

                //GETTING NUMBER OF LIVES
                do {
                    System.out.print("Enter " + enemyBoss.getName() + " lives: ");
                    enemyBoss.setLives(stdinScanner.nextInt());
                    System.out.println("You entered: " + enemyBoss.getLives());
                    if (enemyBoss.getLives() < 0) {
                        System.out.println(enemyBoss.getName() + "'s lives must be greater than 0");
                    }
                }
                while(enemyBoss.getLives() < 0);

                //ADDING enemyBoss TO ARRAYLIST
                Characters.add(enemyBoss);
            }



            else if(pointer == 4){
                for(int i = 0; i < Characters.size() - 1; i++){
                    System.out.println(Characters.get(i).toString());
                }


            }
            else if(pointer == 5){
                System.out.println("Hi 5");
            }
            else if(pointer == 6){
                System.out.println("Hi 5");
            }
            else if(pointer == 7){
                System.out.println("Hi 5");
            }
            else if (pointer == 8){
                System.out.println("Hi 5");
            }

        }
        while(pointer != 9);
    }
}
