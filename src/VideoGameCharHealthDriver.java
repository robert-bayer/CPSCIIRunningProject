import java.util.Scanner;

/**
 * The following is a driver for the VideoGameChar class
 * <p>
 *     This driver is updated to have a health tracking system such that healing or damage is induced on the character.
 *     Other aspects have been changed in the functioning class.  See VideoGameChar.
 *     NOTE: THIS IS AN UPDATED CLASS FROM THE ORIGINAL TO BE MORE CLEAN AND EFFICIENT
 * </p>
 * @author Robert Bayer
 * @version 0.1.8
 * @date 10/02/2021
 */
public class VideoGameCharHealthDriver {


    public static void main(String[] args) {
        System.out.println("Welcome to the VideoGameCharHealth class driver");

        //Creating of Scanner and Blank VideoGameChar Obj
        Scanner stdinScanner;
        stdinScanner = new Scanner(System.in);
        VideoGameChar NewCharacter = new VideoGameChar();

        //Getting the Name
        System.out.print("Please enter the name of the character: ");
        NewCharacter.setName(stdinScanner.next());

        //Getting Max Health
        do{
            System.out.print("Enter " + NewCharacter.getName()+  "'s max health: ");
            NewCharacter.setMaxHealth(stdinScanner.nextDouble());
            if(NewCharacter.getMaxHealth() <= 0.0){
                System.out.println(NewCharacter.getName()+ "'s max health must be greater than 0.0.");
            }
        }
        while(NewCharacter.getMaxHealth() <= 0);

        //Getting the Remaining Health
        do {
            System.out.print("Enter " + NewCharacter.getName() + "'s remaining health: ");
            NewCharacter.setRemainingHealth(stdinScanner.nextDouble());
            if (NewCharacter.getRemainingHealth() < 0 || NewCharacter.getRemainingHealth() > NewCharacter.getMaxHealth()) {
                System.out.println(NewCharacter.getName() + "'s remaining health must be greater than 0.0 and less than max health (" + NewCharacter.getMaxHealth() + ").");
            }
        }
        while(NewCharacter.getRemainingHealth() < 0 || NewCharacter.getRemainingHealth() > NewCharacter.getMaxHealth());

        //Determining Add or Subtract
        do {
            System.out.print("Enter 'add' to increase " + NewCharacter.getName() + "'s health or 'sub' to decrease it: ");
            NewCharacter.setOperator(stdinScanner.next());
            if (!NewCharacter.getOperator().equals("add") && !NewCharacter.getOperator().equals("sub")) {
                System.out.println("You did not enter either 'add' or 'sub'.");
            }
        }
        while(!NewCharacter.getOperator().equals("add") && !NewCharacter.getOperator().equals("sub"));

        if(NewCharacter.getOperator().equals("add")){
            do {
                System.out.print("Enter the amount to increase " + NewCharacter.getName() + "'s health: ");
                NewCharacter.setModifier(stdinScanner.nextDouble());
                if (NewCharacter.getModifier() < 0 || NewCharacter.getModifier() > NewCharacter.getMaxHealth()) {
                    System.out.println("The amount must be greater than 0.0 but less than " + NewCharacter.getName() + "'s original Health (" + NewCharacter.getMaxHealth() + ").");
                }
            }
            while(NewCharacter.getModifier() < 0 || NewCharacter.getModifier() > NewCharacter.getMaxHealth());

            do {
                System.out.print("Please enter how many iterations to increase " + NewCharacter.getName() + "'s health (1 - 10): ");
                NewCharacter.setIterations(stdinScanner.nextInt());
                if (NewCharacter.getIterations() < 1 || NewCharacter.getIterations() > 10) {
                    System.out.println("Only 1 through 10 are acceptable iteration inputs.");
                }
            }
            while(NewCharacter.getIterations() < 1 || NewCharacter.getIterations() > 10);

            for(int i = 0; i < NewCharacter.getIterations(); i++){
                System.out.println("Iteration " + (i+1));
                NewCharacter.increaseHealth(NewCharacter.getModifier());
                System.out.println(NewCharacter.getHealthPhrase());
            }
        }

        else{
            do{
                System.out.print("Enter the amount to decrease " + NewCharacter.getName() + "'s health: ");
                NewCharacter.setModifier(stdinScanner.nextDouble());
                if(NewCharacter.getModifier() <= 0 || NewCharacter.getModifier() > NewCharacter.getMaxHealth()){
                    System.out.println("The amount must be greater than 0.0 but less than " + NewCharacter.getName() + "'s original Health (" + NewCharacter.getMaxHealth() + ").");
                }
            }
            while(NewCharacter.getModifier() <= 0 || NewCharacter.getModifier() > NewCharacter.getMaxHealth());

            do {
                System.out.print("Please enter how many iterations to decrease " + NewCharacter.getName() + "'s health (1 - 10): ");
                NewCharacter.setIterations(stdinScanner.nextInt());
                if (NewCharacter.getIterations() < 1 || NewCharacter.getIterations() > 10) {
                    System.out.println("Only 1 through 10 are acceptable iteration inputs.");
                }
            }
            while(NewCharacter.getIterations() < 1 || NewCharacter.getIterations() > 10);

            for(int i = 0; i < NewCharacter.getIterations(); i++) {
                System.out.println("Iteration " + (i + 1));
                NewCharacter.decreaseHealth(NewCharacter.getModifier());
                System.out.println(NewCharacter.getHealthPhrase());
            }
        }

    }
}
