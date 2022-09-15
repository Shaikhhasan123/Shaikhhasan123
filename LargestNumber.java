/**
 * Class:
 * @author: Shaikh Hasan
 * @version: 1.0
 * Course: ITEC 2140
 * Date: September 15, 2022
 * Description: This program will determine the largest number out of three random numbers inputed. 
 */
import java.util.Scanner;
public class LargestNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("1st number: ");
        int num1 = in.nextInt();

        System.out.print("2nd number: ");
        int num2 = in.nextInt();

        System.out.print("3rd number: ");
        int num3 = in.nextInt();

        if (num1 > num2)
            if (num1 > num3)
                System.out.println("The largest number: " + num1);

        if (num2 > num1)
            if (num2 > num3)
                System.out.println("The largest number: " + num2);

        if (num3 > num1)
            if (num3 > num2)
                System.out.println("The largest number: " + num3);
    }
}
