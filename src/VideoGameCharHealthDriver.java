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
        System.out.print("Please input the name of the character: ");
        NewCharacter.setName(stdinScanner.next());

        //Getting the Max Health
        System.out.print("Enter max health: ");
        NewCharacter.setMaxHealth(stdinScanner.nextDouble());

        while(NewCharacter.getMaxHealth() <= 0){
            System.out.println("Youre a dumbass. Make it bigger than 0");
            System.out.print("Gimme MH");
            NewCharacter.setMaxHealth(stdinScanner.nextDouble());
        }

        //Getting the Remaining Health
        System.out.print("Enter Remaining Health: ");
        NewCharacter.setRemainingHealth(stdinScanner.nextDouble());

        while(NewCharacter.getRemainingHealth() < 0 || NewCharacter.getRemainingHealth() > NewCharacter.getMaxHealth()) {
            System.out.println("YOure a fucking idiot.  Must be more than 0 and less than max health");
            System.out.print("Gimme RH: ");
            NewCharacter.setRemainingHealth(stdinScanner.nextDouble());
        }

        //Determining Add or Subtract
        System.out.print("Do you want to add or stubract: ");
        NewCharacter.setOperator(stdinScanner.next());

        while(!NewCharacter.getOperator().equals("add") && !NewCharacter.getOperator().equals("sub")){
            System.out.println("Youre dumb.  must be sub or add.");
            System.out.print("Do you want to add or sub: ");
            NewCharacter.setOperator(stdinScanner.next());
        }

        if(NewCharacter.getOperator().equals("add")){
            System.out.print("How much you want to increase: ");
            NewCharacter.setModifier(stdinScanner.nextDouble());
            while(NewCharacter.getModifier() < 0 || NewCharacter.getModifier() > NewCharacter.getMaxHealth()){
                System.out.println("Must be between 0 and max health.");
                System.out.print("How much you want to increase: ");
                NewCharacter.setModifier(stdinScanner.nextDouble());
            }
        }

        else{
            System.out.print("How much you want to decrease: ");
            NewCharacter.setModifier(stdinScanner.nextDouble());
            while(NewCharacter.getModifier() <= 0 || NewCharacter.getModifier() > NewCharacter.getMaxHealth()) {
                System.out.println("Must be between 0 and max health.");
                System.out.print("How much you want to decrease: ");
                NewCharacter.setModifier(stdinScanner.nextDouble());
            }
        }

        System.out.print("How many times do you want to iterate: ");
        NewCharacter.setIterations(stdinScanner.nextInt());
        while(NewCharacter.getIterations() < 1 || NewCharacter.getIterations() > 10){
            System.out.println("Must be between 1 and 10.");
            System.out.print("How many iterations would you like: ");
            NewCharacter.setIterations(stdinScanner.nextInt());
        }


        if(NewCharacter.getOperator().equals("add")){
            for(int i = 0; i < NewCharacter.getIterations(); i++){
                System.out.println("Iteration " + (i+1));
                NewCharacter.increaseHealth(NewCharacter.getModifier());
                System.out.println(NewCharacter.getHealthPhrase());
            }
        }

        else{
            for(int i = 0; i < NewCharacter.getIterations(); i++){
                System.out.println("Iteration " + (i+1));
                NewCharacter.decreaseHealth(NewCharacter.getModifier());
                System.out.println(NewCharacter.getHealthPhrase());
            }
        }

    }
}
