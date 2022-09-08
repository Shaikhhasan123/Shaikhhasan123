/**
 * Class: Cylinder
 * @author: Shaikh Hasan
 * @version: 1.0
 * @course: ITEC 2140 Fall 2022
 * date: September 8, 2022
 * description: This program will calculate the base area and volume of a Cylinder.
 */
import java.util.Scanner;
public class Cylinder {
    public static void main( String [] args)
    {
       Scanner input = new Scanner(System.in);
       double PI = 3.1416;


       System.out.print(" Enter the radius of a base circle: ");

       double radius = input.nextDouble();

       System.out.print(" Enter the length of a cylinder: ");
       double length = input.nextDouble();

       double area = PI * radius * radius;
       double volume = PI * radius * radius * length;

       System.out.println(" The base area of a Cylinder " + area);
       System.out.println(" The volume of a Cylinder is: " + volume);

    }


}
