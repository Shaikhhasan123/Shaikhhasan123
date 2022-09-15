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
