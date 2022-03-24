package se.lexicon.rajashree;

import java.util.Scanner;
import java.util.Random;

public class GuessRandomNumber {

    public static void main(String[] args) {

        int maxRange = 10 ;
        int userGuessNumber = 0;

        //create objects
        Scanner SC = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber = rand.nextInt(maxRange);

        //logic to check the guess of the user and number of try

        for(int loop=1; loop<=10; loop++)
        {
            System.out.println("Please enter your Guess : ");
            userGuessNumber = SC.nextInt();
            if(userGuessNumber == randomNumber){
                System.out.println("Yes your guess is correct and your total guess is : "+loop);
                break;
            }
            else if(userGuessNumber > randomNumber){
                System.out.println("Your Guess is too big ");
                continue;
            }
            if(userGuessNumber < randomNumber){
                System.out.println("our Guess is too small.... : ");
                continue;
            }

        }
    }
}











