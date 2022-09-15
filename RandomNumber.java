/**
 * Class: Random Number
 * @author: Shaikh Hasan
 * @version: 1.0
 * Course: ITEC 2140
 * Date: September 15, 2022
 * Description: This program will let the user input a random number from 0-10 and let them know if they choose the wining number or not.
 */
import java.util.Scanner;
public class RandomNumber {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0-10 : ");

        int rand = (int)(Math.random() * 11);
        int guessNumber = input.nextInt();

        if(rand == guessNumber){
            System.out.println("Hurray!, you guessed the number. ");
        }
        else {
            System.out.println("You Lost !!");
        }
    }

}
