package Pro_1;
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

	 public static void main(String[] args) {
		    
		    Random rand = new Random();
		    int number = rand.nextInt(100) + 1;
		    
		    Scanner input = new Scanner(System.in);
		    int guess;
		    boolean win = false;
		    
		    while(!win) {
		      System.out.print("Guess a number between 1 and 100: ");
		      guess = input.nextInt();
		      //Ttrying to stop bad user using condition
		      if(guess<0 || guess>=101) {
		    	  win = false;
		    	  System.out.println("Read the guidelines of the game, You cannot enter number which is not lie betweeen 1 to 100.");
		    	  
		      }else {
		      
		      if(guess == number) {
		        win = true;
		        System.out.println("You guessed the number! You win!");
		      }
		      else if(guess < number) {
		        System.out.println("Your guess is too low, try again.");
		      }
		      else if(guess > number) {
		        System.out.println("Your guess is too high, try again.");
		      }
		     }
		    }
		  }

		}