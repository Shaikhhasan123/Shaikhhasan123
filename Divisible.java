/**
 * Class: Divisible
 * @author: Shaikh Hasan
 * @version: 1.0
 * Course: ITEC 2140
 * Date: September 15, 2022
 * Description: This program will determine wheather a random number is divisable by either 5 or 3 or both. 
 */
import java.util.Scanner;

public class Divisible
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        if (num % 3 == 0 && num % 5 == 0)
            System.out.println("Divisible by 3 and 5");
        else if (num % 3 == 0)
            System.out.println("Divisible by 3 but not by 5");
        else if (num % 5 == 0)
            System.out.println("Divisible by 5 but not by 3");
        else
            System.out.println("Neither divisible by 3 nor by 5");
    }
}
