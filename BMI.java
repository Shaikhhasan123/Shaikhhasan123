/**
 * Class: BMI
 * @author: Shaikh Hasan
 * @version: 1.2
 * @course: ITEC 2140 Fall 2022
 * date: September 8, 2022
 * description: This program will calculate BMI
 */
import java.util.Scanner;
public class BMI {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Weight: ");

        int weight = input.nextInt();
        input.nextLine();

        System.out.print("Height(feet): ");
        int heightFeet = intput.nextInt();
        System.out.print("Height(inches): ");
        int heightInch = input.nextInt();
        double kilograms = weight / 2.0;
        double meters = (heightFeet * 12 + heightInch) * 0.0254;
        double BodyMassIndex = kilograms / (meters * meters);
        System.out.print("Your body mass index is " + BodyMassIndex);
        
    }
}
