/**
 * Class: Paint
 * @author: Shaikh Hasan
 * @version: 1.0
 * @course: ITEC 2140 Fall 2022
 * date: September 8, 2022
 * description: This program will calculate the gallons and quarts of paint are needed to paint the room.
 */
import java.util.Scanner;
public class Paint {
    public static void main(String[] args) {
        int length, width, numberOfDoors, numberOfWindows;
        double height;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter length: ");
        length = input.nextInt();

        System.out.print("Enter width: ");
        width = input.nextInt();

        System.out.print("Enter height: ");
        height = input.nextDouble();
        System.out.print("Enter number of windows: ");
        numberOfWindows = input.nextInt();

        System.out.print("Enter number of doors: ");
        numberOfDoors = input.nextInt();

        double totalSurfaceArea = 2 * (length * width + length* height + width * height);

        int areaOfFloor = length * width;

        int areaOfDoors = 21 * numberOfDoors;

        int areaOfWindows = 15 * numberOfWindows;

        double totalPaintArea = totalSurfaceArea - areaOfFloor - areaOfDoors - areaOfWindows;
        int requiredPaint = (int)(totalPaintArea / 350);

        double quarts=requiredPaint*4;

        System.out.println(requiredPaint+" gallons and "+quarts/2+" quarts of paint needed for the room");

    }
}
