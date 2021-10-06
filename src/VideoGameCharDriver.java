/**
 *
 *Basic Driver for the Video Game Character
 * @Author Robert Bayer
 * @Date 09/11/2021
 * @version 0.1.6
 *
 */


import java.util.Scanner;

public class VideoGameCharDriver {

    public static void main(String[] args){
        System.out.println("Welcome to the VideoGameChar class driver");

        /*
        Creating of Scanner and Blank VideoGameChar Obj
         */
        Scanner stdinScanner;
        stdinScanner = new Scanner(System.in);
        VideoGameChar NewCharacter = new VideoGameChar();

        /*
        User Input
         */
        System.out.print("Please enter the name of the character: ");
        NewCharacter.setName(stdinScanner.next());
        System.out.println("You entered " + NewCharacter.getName());
        System.out.print("Please enter " + NewCharacter.getName() + "'s max health: ");
        NewCharacter.setMaxHealth(stdinScanner.nextDouble());
        System.out.println("You entered " + NewCharacter.getMaxHealth());
        System.out.print("Please enter " + NewCharacter.getName() + "'s remaining health: ");
        NewCharacter.setRemainingHealth(stdinScanner.nextDouble());
        System.out.println("You entered " + NewCharacter.getRemainingHealth());

        /*
        Displaying all Data
         */
        System.out.println(NewCharacter.toString());
        /*
        Custom Method
         */
        NewCharacter.setLevel(3);


    }


}
