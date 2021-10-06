import java.util.Scanner;

/**
 * The following is a driver for the VideoGameChar class
 * <p>
 *     This driver is updated to have a health tracking system such that healing or damage is induced on the character.
 *     Other aspects have been changed in the functioning class.  See VideoGameChar.
 * </p>
 * @author Robert Bayer
 * @version 0.1.8
 * @date 10/02/2021
 */

public class VideoGameCharHealthDriver {

    public static void main(String[] args) {
        System.out.println("Welcome to the VideoGameCharHealth class driver");
        boolean successMarker = false; //A Marker that will keep us in a loop until the desired outcome is achieved
        double doubleTestUnit; //A variable to store a scanned double while tests and methods are being run
        int intTestUnit; //A variable to store a scanned int while tests and methods are being run
        String operator; //A variable to store the requested operator to test if it is legal
        double healthModifier = 0.0; //A variable to store how much the health will be changed by

        //Creating of Scanner and Blank VideoGameChar Obj
        Scanner stdinScanner;
        stdinScanner = new Scanner(System.in);
        VideoGameChar NewCharacter = new VideoGameChar();

        //Getting the Name
        System.out.print("Please input the name of the character: ");
        NewCharacter.setName(stdinScanner.next());

        //Getting the Maximum Health
        do{         //Runs this part at least once
            System.out.print("Please enter " + NewCharacter.getName() + "'s max health: ");
            doubleTestUnit = stdinScanner.nextDouble();
            //Testing to see if the given Max health is above 0.0 using the method in the main class
            if(NewCharacter.testMaxHealth(doubleTestUnit)){
                NewCharacter.setMaxHealth(doubleTestUnit);
                successMarker = true;
            }
            else{   //Gives an error message
                System.out.println(NewCharacter.getName() + "'s max health must be greater than 0.0.");
            }
        }
        while(!successMarker);
        successMarker = false;


        //Getting the Remaining Health
        do{
            System.out.print("Please enter " + NewCharacter.getName() + "'s remaining health: ");
            doubleTestUnit = stdinScanner.nextDouble();
            //Testing to see if given Remaining Health is above 0.0 and below or equal to the Max health using the method in the main class
            if (NewCharacter.testRemainingHealth(doubleTestUnit)){
                NewCharacter.setRemainingHealth(doubleTestUnit);
                successMarker = true;
            }
            else{
                System.out.println(NewCharacter.getName() + "'s remaining health must be greater than 0.0 and less than their max health (" + NewCharacter.getMaxHealth() +").");
            }
        }
        while(!successMarker);
        successMarker = false;

        //Determining Whether to Sub or Add Health
        do{
            System.out.print("Please enter 'add' if you want to increase " + NewCharacter.getName() + "'s remaining health or 'sub' if you want to decrease it: ");
            operator = stdinScanner.next();
            if (NewCharacter.testOperator(operator)){
                //Nested Loop
                //System.out.println("Let's " + operator);

                /*
                THIS NEXT PORTION IS FOR ADDING HEALTH TO THE PLAYER
                 */

                if(operator.equals("add")){
                    //Finding the Amount of Health to be Added
                    do {
                        System.out.print("Please enter the amount you want to increase " + NewCharacter.getName() + "'s health: ");
                        doubleTestUnit = stdinScanner.nextDouble();
                        if (NewCharacter.testRemainingHealth(doubleTestUnit)) {         //Testing to see if amount of health is in between 0.0 and the max health
                            healthModifier = doubleTestUnit;
                            successMarker = true;
                        } else {
                            System.out.println("The amount must be greater than 0.0 but less than " + NewCharacter.getName() + "'s original health. (" + NewCharacter.getMaxHealth() + ")");
                        }
                    }
                    while(!successMarker);
                    successMarker = false;
                    do{
                        //Finding the Amount of Iterations to run the addition loop
                        System.out.print("Please enter how many iterations to increase "  + NewCharacter.getName() + "'s health (1 - 10): ");
                        intTestUnit = stdinScanner.nextInt();
                        if(NewCharacter.testIteration(intTestUnit)){        //Testing to see if the amount of requested iterations are between (inclusive) 1 and 10
                            //System.out.println("I will now iterate through " + intTestUnit + " times.");
                            System.out.println("Applying " + intTestUnit + "iterations of increasing " + NewCharacter.getName() + "'s health by " + doubleTestUnit);
                            NewCharacter.increaseHealth(healthModifier, intTestUnit);
                            successMarker = true;
                        }
                        else {
                            System.out.println("Only 1 through 10 are acceptable iteration inputs.");
                        }
                    }
                    while(!successMarker);
                }

                /*
                THIS NEXT PORTION IS FOR REMOVE HEALTH FROM THE PLAYER
                 */
                else{
                    do {
                        //Finding the Amount damage to be dealt.
                        System.out.print("Please enter the amount to decrease " + NewCharacter.getName() + "'s health: ");
                        doubleTestUnit = stdinScanner.nextDouble();
                        if (NewCharacter.testRemainingHealth(doubleTestUnit)) {     //Testing to see if amount of health is in between 0.0 and the max health
                            healthModifier = doubleTestUnit;
                            successMarker = true;
                        }
                        else {
                            System.out.println("The amount must be greater than 0.0 but less than " + NewCharacter.getName() + "'s original health. " + NewCharacter.getMaxHealth() + ")");
                        }
                    }
                    while(!successMarker);
                    successMarker = false;
                    do{
                        //Finding the Amount of iterations to run the subtraction loop
                        System.out.print("Please how many iterations to decrease "  + NewCharacter.getName() + "'s health (1 - 10): ");
                        intTestUnit = stdinScanner.nextInt();
                        if(NewCharacter.testIteration(intTestUnit)){        //Testing to see if the amount of requested iterations are between (inclusive) 1 and 10
                            //System.out.println("I will now iterate through " + intTestUnit + " times.");
                            System.out.println("Applying " + intTestUnit + "iterations of decreasing " + NewCharacter.getName() + "'s health by " + doubleTestUnit);
                            NewCharacter.decreaseHealth(healthModifier, intTestUnit);
                            successMarker = true;
                        }
                        else {
                            System.out.println("Only 1 through 10 are available iteration inputs.");
                        }
                    }
                    while(!successMarker);
                }
            }
            else {
                System.out.println("You did not enter either 'add' or 'sub'");
            }
        }
        while(!successMarker);
    }
}