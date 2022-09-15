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
