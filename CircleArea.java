/**
 * Class: Circle Area
 * @author: Shaikh Hasan
 * @version: 1.0
 * Course: ITEC 2140
 * Date: September 15, 2022
 * Description: This program will calculate the Area of a circle and will not generate any answer if a negative number is inputed. 
 */
import java.util.Scanner;
public class CircleArea {
    public static void main (String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the radius: ");
       double radius = input.nextDouble();
       double area = Math.PI * radius * radius;
       boolean isNegative = (radius < 0 );

       if(isNegative){
           System.out.println("Invalid Entry.(radius can only be positive)");

       }
        else{
            System.out.println("The calculated value of the circle area is " + area );
       }


    }
