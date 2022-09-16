/**
 * Class: Day Of The Week
 * @author: Shaikh Hasan
 * @version: 1.0
 * Course: ITEC 2140
 * Date: September 15, 2022
 * Description: This program will generate output with names of days of a week when inputting a number from 1-7
 */
import java.util.Scanner;

public class Day {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the day of the week: ");
        int n = in.nextInt();

        if (n == 1){
            System.out.println("Week day");
        } else if (n == 2){
            System.out.println("Week day");
        }else if (n == 3) {
            System.out.println("Week day");
        }else if (n == 4) {
            System.out.println("Week day");
        }else if (n == 5) {
            System.out.println("Week day");
        }else if (n == 6) {
            System.out.println("Weekend");
        }else if (n == 7) {
            System.out.println("Weekend");
        } else
            System.out.println("Invalid week day");
    }

}
